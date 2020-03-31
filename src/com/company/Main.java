package com.company;

import java.util.Scanner;

public class Main {
   static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int x;
        int result=0;
        int year=0;
        boolean l = true;

        while (l){
            System.out.println("(1) to Check if its leap year or not");
            System.out.println("(0) to exit");
            x = scanner.nextInt();
            if (x!=0){
                System.out.println(" Enter a year to Check if its leap year or not");

                year = scanner.nextInt();


                result =  Checkmethod(year);
                if (result != 0){
                    System.out.println(result + " " + "is a leap year");

                }else {
                    System.out.println(year + " " + "is not a leap year");

                }

            }else {
                System.exit(0);
            }




        }


    }

    private static int Checkmethod(int year) {

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year%400 ==0){
                    return year;
                }
            }
        }else {
            return 0;
        }
       return 0;
    }
}
