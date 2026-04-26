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

        double chosenPrice;
        boolean isLarge = sandwichSize.equals("l") || sandwichSize.equals("large");
        if (isLarge) {
            chosenPrice = sandwichLarge;
        } else {
            chosenPrice = sandwichRegular;
        }

        System.out.println("Would you like the sandwich loaded (Yes/no): ");
        String loadedSandwich = input.nextLine().trim().toLowerCase();

        double loadPrice = 0.0;
        if (loadedSandwich.equals("y") || loadedSandwich.equals("yes")) {
            if (isLarge) {
                loadPrice = 1.75;
            } else {
                loadPrice = 1.00;
            }
        }

        // Customer age

        System.out.println("Students (17 and younger) and Seniors (65 and older) get a discount!");
        System.out.print("What is your age? ");

        // Read age (as an int)
        int age = input.nextInt();
        System.out.println("you entered age " + age);

        double finalPrice = chosenPrice;
        if (age <= 17) {
            finalPrice = chosenPrice * 0.9;
        } else if (age >= 65) {
            finalPrice = chosenPrice * 0.8;
        }

        System.out.printf("Final price: $%.2f", finalPrice);
    }
}
