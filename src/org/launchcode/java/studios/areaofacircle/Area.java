package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        public static Double getArea(Double radius) {
            return 3.14 * radius * radius;
        }
        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        String name = input.next();
        input.close();


    }

}
