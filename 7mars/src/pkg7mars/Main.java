package pkg7mars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String test = "test";
        String test2[] = test.split("e");

        for (String c : test2) {
            println(c);
        }
    }

    public static void println(String msg) {
        System.out.println(msg);
    }
}
