package com.pluralsight.destiny2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Type you fucking idiot!");

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        String[] parts = s.split(" ");

        for(String w:parts) {
            System.out.println(w);
        }

        StringBuilder m = new StringBuilder();

        m.append("Its me,");

        m.append("Tejas");

        m.append("Sitting on the porch");

        int pos = m.indexOf(" Sitting on the porch");

        m.insert(pos,"your brother");

        String sww = m.toString();

        System.out.println(sww);

    }
}
