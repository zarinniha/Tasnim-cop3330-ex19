/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class massIndex {

    public static void main(String args[]) {
        double weight;
        double height;

        while (true) {
            System.out.print("What is your height in iches? ");
            Scanner sc1 = new Scanner(System.in);
            //only accepting numeric value
            if (sc1.hasNextDouble()) {
                String temp1 = sc1.nextLine();
                height = Double.parseDouble(temp1);
                break;

            } else {
                System.out.println("Please choose a numeric value ");
            }

        }

        while (true) {
            Scanner sc2 = new Scanner(System.in);
            System.out.print("What is you weight is pounds? ");
            //only accepting numeric value
            if (sc2.hasNextDouble()) {
                String temp2 = sc2.nextLine();
                weight = Double.parseDouble(temp2);
                break;

            } else {
                System.out.print("Please choose a numeric value");
            }

        }
        double bmi = weight / (height * height) * 703;

        if (bmi < 18.5) {
            System.out.print("You are underweight. You should wee your doctor.");
        } else if (bmi > 25) {
            System.out.print("You are overweight. You should see your doctor.");
        } else {
            System.out.print("You are within the ideal weight range.");
        }

        System.out.print(String.format("Your BMI is %.2f.", bmi));

    }
}