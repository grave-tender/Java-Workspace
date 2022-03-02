package model;

public class Passenger {
    private int id;
    private String name;
    private char gender;

    public Passenger(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
