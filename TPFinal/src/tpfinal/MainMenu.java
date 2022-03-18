package tpfinal;

import java.util.List;

import dao.*;
import daoImp.*;
import model.*;

public class MainMenu extends UtilityMethods{
    private static StudentDao studentsDao = new StudentDaoImp();
    private static CourseDao coursesDao = new CourseDaoImp();
    private static ResultsDao resultsDao = new ResultsDaoImp();

    public static void mainMenu() {
        int option = 0;
        while (option != 4) {
            println("1. Etudiant");
            println("2. Courses");
            println("3. Results");
            println("4. Quit");

            option = scNextInt();

            if (option >= 1 && option <= 3)
                subMenu(option);
            else if (option != 4)
                println("Please enter at least one of the following");
        }
    }

    private static void subMenu(int mainOption) {
        int option = 0;

        while (option != 4) {
            println("1. Create");
            println("2. Delete");
            println("3. Display");
            println("4. Go Back");

            option = scNextInt();

            if (option >= 1 && option <= 3)
                operationMenu(mainOption, option);
            else if (option != 4)
                println("Please enter at least one of the following");
        }
    }

    private static void operationMenu(int mainOption, int subOption) {
        // ici ce que j'ai fait c'est que j'ai combiné les deux options dans un phrase
        // afin d'utiliser un seul switch desus. Le chiffre à gauche
        // est la Class choisie, et celui à droite est le choix du deuxièmme menu.

        String options = mainOption + "" + subOption;
        switch (options) {
            case "11":
                creationStudent();
                break;
            case "12":
                deletionStudent(studentsDao.findAll());
                break;
            case "13":
                displayStudent();
                break;
            case "21":
                creationCourse();
                break;
            case "22":
                deletionCourse(coursesDao.findAll());
                break;
            case "23":
                displayCourse();
                break;
            case "31":
                creationResult();
                break;
            case "32":
                deletionResult(resultsDao.findAll());
                break;
            case "33":
                displayResults();
                break;
        }
    }

    private static void creationStudent() {
        println("Please enter the student's id (String): ");
        String id = sc.next();
        println("Please enter the student's first name (String): ");
        String firstName = sc.next();
        println("Please enter the student's last name (String): ");
        String lastName = sc.next();
        println("Please enter the student's gender (char): ");
        char gender = sc.next().charAt(0);

        studentsDao.create(id, firstName, lastName, gender);

        success("added");
    }

    private static void deletionStudent(List<Student> studentsList) {
        // checks if there's something to delete
        if (studentsList.isEmpty()) {
            println("There's nothing to delete");
            return;
        }

        // enter the position of a student and checks if it exists
        displayStudent();
        println("Please enter the position of the student to delete (int):");
        int pos = scNextInt() - 1;

        if (!isPositionInListRange(pos, studentsList)) {
            println("This position doesn't exist");
            return;
        }

        // check if the student has a result and delete it
        Student chosenStudent = studentsList.get(pos);
        List<Results> resultsList = resultsDao.findAll();
        int size = resultsList.size() - 1;

        for (int i = size; i >= 0; i--) {
            Student targetStudent = resultsList.get(i).getStudent();

            if (targetStudent.equals(chosenStudent)) {
                resultsDao.delete(i);
                success("delted the results of this student");
            }
        }

        // deletes the student
        studentsDao.delete(pos);
        success("deleted student");
    }

    private static void displayStudent() {
        List<Student> studentList = studentsDao.findAll();

        // checks if the list has anything to be displayed
        if (studentList.isEmpty()) {
            println("There's nothing to display");
            return;
        }

        // iterates over the list of students and displays their attributes
        for (int i = 0; i < studentList.size(); i++) {
            Student s = studentList.get(i);
            println("pos: " + (i + 1) + " id: " + s.getId() + "\tname: " + s.getFirstName() + " "
                    + s.getLastName() + "\tgender: " + s.getGender() + "\n");
        }
    }

    private static void creationCourse() {
        println("Please enter the course's id (String): ");
        String id = sc.next();
        println("Please enter the course's name (String): ");
        String name = sc.next();

        coursesDao.create(id, name);

        success("added");
    }

    private static void deletionCourse(List<Course> coursesList) {
        // checks if there's anything to delete
        if (coursesList.isEmpty()) {
            println("There are no courses to delete");
            return;
        }

        // enter the position of the course and see if exists
        displayCourse();
        println("Please enter the position of the course to delete (int):");
        int pos = scNextInt() - 1;

        if (!isPositionInListRange(pos, coursesList)) {
            println("This position doesn't exist");
            return;
        }

        // choose between a soft delete and hard delete and see if the chosen option
        // exists
        println("Please chose from the following (int):\n\t1. Soft delete\n\t2. Hard delete");
        int option = scNextInt();

        if (option != 1 && option != 2) {
            println("Please choose between a soft and a hard delete (1 or 2)");
            return;
        }

        Course chosenCourse = coursesList.get(pos);
        List<Results> resultsList = resultsDao.findAll();

        // if it's a soft delete
        if (option == 1) {
            // check if the course has already been soft deleeted
            if (chosenCourse.getIsDeprecated()) {
                println("This course is already deprecated, cannot soft delete");
                return;
            }

            // changes the original course's attributes
            String deprecatedCourseName = chosenCourse.getCourseName() + " (deprecated)";
            chosenCourse.setCourseName(deprecatedCourseName);
            chosenCourse.setIsDeprecated(true);

            // check if there are results with this class and deprecate them too if any
            int size = resultsList.size() - 1;
            for (int i = size; i >= 0; i--) {
                Results currentResult = resultsList.get(i);
                Course resultsCourse = currentResult.getCourse();

                if (resultsCourse.equals(chosenCourse)) {
                    currentResult.setCourse(chosenCourse);

                    resultsDao.update(i, currentResult);
                    success("depracated course in associated result");
                }
            }
            coursesDao.update(pos, chosenCourse);
            success("depracated course");
        }
        // if it's a hard delete
        else if (option == 2) {
            // check if there are any classes with those results and delete them
            int size = resultsList.size() - 1;
            for (int i = size; i >= 0; i--) {
                Results currentResult = resultsList.get(i);
                Course resultsCourse = currentResult.getCourse();

                if (resultsCourse.equals(chosenCourse)) {
                    resultsDao.delete(i);
                    success("deleted associated results");
                }
            }
            coursesDao.delete(pos);
            success("deleted this course");
        }

    }

    private static void displayCourse() {
        List<Course> coursesList = coursesDao.findAll();

        // check if there's anything to display
        if (coursesList.isEmpty()) {
            println("There's nothing to display");
            return;
        }

        // iterates over the list of courses and displays their attributes
        for (int i = 0; i < coursesList.size(); i++) {
            Course c = coursesList.get(i);
            println("pos " + (i + 1) + " id: " + c.getId() + "\tname: " + c.getCourseName());
        }
    }

    private static void creationResult() {
        // check if there are both students and courses to be able to create a result
        if (studentsDao.findAll().size() == 0 || coursesDao.findAll().size() == 0) {
            println("Please be sure at least have one student and one course to begin adding a result");
            return;
        }

        List<Student> studentsList = studentsDao.findAll();
        List<Course> coursesList = coursesDao.findAll();
        Student chosenStudent;
        Course chosenCourse;

        // choose a student to assign the result to
        println("From the following students:");
        displayStudent();
        println("Chose a student by its position (int)");
        int pos = scNextInt() - 1;
        if (pos > studentsList.size() - 1 || pos < 0) {
            println("This position doesn't exist");
            return;
        } else {
            chosenStudent = studentsList.get(pos);
        }

        // choose a course to assign the result to
        println("From the following courses:");
        displayCourse();
        println("Chose a course by its position (int)");
        pos = scNextInt() - 1;
        if (pos > coursesList.size() - 1 || pos < 0) {
            println("This position doesn't exist");
            return;
        } else {
            chosenCourse = coursesList.get(pos);
        }

        // enter the additional attributes of a result (check if they're between 0 and 100%)
        println("Please enter the mark of the first test as a % (int)");
        int marks1 = scNextInt();
        if(marks1 < 0) marks1 = 0;
        else if(marks1 > 100) marks1 = 100;
        println("Please enter the mark of the second test as a % (int)");
        int marks2 = scNextInt();
        if(marks2 < 0) marks2 = 0;
        else if (marks2 > 100) marks2 = 100;

        resultsDao.create(chosenStudent, chosenCourse, marks1, marks2);

        success("added");
    }

    private static void deletionResult(List<Results> resultsList) {
        //check if there are any results to delete
        if (resultsList.isEmpty()) {
            println("There's nothing to delete.");
            return;
        }

        //get the position of the result to delete and check if it exists
        displayResults();
        println("Please enter the position of the result to delete (int):");
        int pos = scNextInt() - 1;
        if (isPositionInListRange(pos, resultsList)) {
            resultsList.remove(pos);
            success("deleted");
        } else
            println("This position doesn't exist");

    }

    private static void displayResults() {
        List<Results> resultsList = resultsDao.findAll();

        //check if there's something to delete
        if (resultsList.isEmpty()) {
            println("There's nothing to display");
            return;
        }

        for (int i = 0; i < resultsList.size(); i++) {
            Results r = resultsList.get(i);
            println("pos " + (i + 1) + "\n\tstudent's name: " + r.getStudent().getFirstName() + " "
                    + r.getStudent().getLastName());
            println("\tcourse's name: " + r.getCourse().getCourseName());
            println("\taverage: " + ((int) (r.getMarks1() + r.getMarks2()) / 2) + "%");
        }
    }
}
