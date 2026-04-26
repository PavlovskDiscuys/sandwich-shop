package com.pluralsight;
import java.util.Scanner;


public class AppSandwich_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Introduction

        System.out.println("            " + "Welcome to Sarmiento's Subs");
        System.out.println("                  " + "Sandwich Sizes!");

        // Sandwich Size
        System.out.print("(R)egular base price is $5.45, (L)arge base price is $8.95): ");
        String sandwichSize = input.nextLine().trim().toLowerCase();
        System.out.println("A (" + sandwichSize + ") good choice!");
        double sandwichRegular = 5.45;
        double sandwichLarge = 8.95;


//          Bad logic

//        if (sandwichSize == "l"){
//            int chosenSandwich = sandwichLarge;
//        } else {
//            int chosenSandwich = sandwichRegular;
//        }


        double chosenPrice;
        if (sandwichSize.equals("l") || sandwichSize.equals("large")) {
            chosenPrice = sandwichLarge;
        } else {
            chosenPrice = sandwichRegular;
        }

        // Customer age

        System.out.println("Students (17 and younger) and Seniors (65 and older) get a discount!");
        System.out.print("What is your age? ");

        // Read age (as an int)
        int age = input.nextInt();
        System.out.println("you entered age " + age);


//        //  Price Calculation
        //      Bad logic
//        if (age < 18){
//            sandwichRegular = sandwichRegular * 0.9;
//            sandwichLarge = sandwichLarge * 0.9;
//        } else if (age >= 65){
//            sandwichRegular = sandwichRegular * .8;
//            sandwichLarge = sandwichLarge * .8;
//        } else {
//            sandwichRegular = sandwichRegular;
//            sandwichLarge = sandwichLarge;
//        }

        double finalPrice = chosenPrice;
        if (age <= 17) {
            finalPrice = chosenPrice * 0.9;
        } else if (age >= 65) {
            finalPrice = chosenPrice * 0.8;
        }

        System.out.printf("Final price: $%.2f", finalPrice);
    }
}
