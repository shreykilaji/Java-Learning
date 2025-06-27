package com.testpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorErrorHandling {
    public static void main (String[] args){
        final int MONTHS_IN_YEAR=12;
        final int Percent= 100;
        float annualRate= 0;
        int principalAmount= 0;
        short years= 0;
        float monthlyRate= 0;
        int numberOfPayments= 0;

        //creating Object of Scanner Class for reading inputs
        Scanner scanner= new Scanner(System.in);

        //Taking UserInput (Principal Amount)

        while(true) {
            System.out.print("Enter Principal Amount: ");
            principalAmount = scanner.nextInt();
            if(principalAmount >= 1000 && principalAmount <=1000000)
                break;
            System.out.println("Enter a Value between $1000 and $1000000");
        }

        //Taking UserInput (Annual Rate)
        while(true) {
            System.out.print("Enter Annual Rate: ");
            annualRate = scanner.nextFloat();
            if(annualRate >= 1 && annualRate <=30) {
                monthlyRate = annualRate / Percent / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a Value between 1 and 30");
        }
        //Taking UserInput (TimePeriod)
        while(true) {
            System.out.print("Enter Period(Years): ");
            years = scanner.nextShort();
            if(years >= 0 & years <=20) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a Value between 0 and 20");
        }

        System.out.println("-----------------------------------------------------------");

        System.out.println(principalAmount);
        System.out.println(annualRate);
        System.out.println(years);

        double mortgage= principalAmount * (monthlyRate * Math.pow(1 + monthlyRate,numberOfPayments ))/(Math.pow(1 + monthlyRate, numberOfPayments)) -1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);

    }
}
