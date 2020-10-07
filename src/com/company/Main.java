package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int grade = 50;
        switch(grade) {
            case 100 :
                System.out.println("Excellent");
                break;
            case 90 :
                System.out.println("ASFSADFSADFASDF");
                break;
            case 80 :
                System.out.println(" Grade B");
                break;
            case 70 :
                System.out.println("Grade C");
                break;
            case 50 :
                System.out.println("Grade F");
                break;
            default :
                System.out.println("Invalid score");
        }
        System.out.println("Your grade is " + grade);

    }
}