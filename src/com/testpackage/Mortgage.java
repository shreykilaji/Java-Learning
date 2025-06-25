package com.testpackage;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        final int MONTHS_IN_YEAR=12;
        final int Percent= 100;

        //creating Object of Scanner Class for reading inputs
        Scanner scanner= new Scanner(System.in);

        //Taking UserInput (Principal Amount)
        System.out.print("Enter Principal Amount: ");
        int principalAmount= scanner.nextInt();

        //Taking UserInput (Annual Rate)
        System.out.print("Enter Annual Rate: ");
        float annualRate= scanner.nextFloat();
        float monthlyRate = annualRate / Percent / MONTHS_IN_YEAR;

        //Taking UserInput (TimePeriod)
        System.out.print("Enter Period(Years): ");
        short years= scanner.nextShort();
        int numberOfPayments= years * MONTHS_IN_YEAR;

        System.out.println("-----------------------------------------------------------");

        System.out.println(principalAmount);
        System.out.println(annualRate);
        System.out.println(years);

        double mortgage= principalAmount * (monthlyRate * Math.pow(1 + monthlyRate,numberOfPayments ))/(Math.pow(1 + monthlyRate, numberOfPayments)) -1;

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);
    }
}
