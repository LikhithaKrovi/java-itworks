package com.decembertwenty;
import java.util.Scanner;

public class Conditions {
    public static void main (String args[]){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = reader.nextInt();
        char grade;
        if(a % 2 == 0){
            System.out.println("The give number is even");
        } else {
            System.out.println("The give number is odd");
        }
        System.out.print("Enter Score: ");
        int score = reader.nextInt();
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("student scored the grade "+ grade);
        System.out.print("Enter a week number: ");
        int week = reader.nextInt();
        String day = null;
        switch (week){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;
            default: System.out.println("undefined day");

        }
        System.out.println("Todays day" + day);

    }
}
