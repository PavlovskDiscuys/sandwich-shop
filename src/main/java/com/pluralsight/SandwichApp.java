package com.pluralsight;
import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {


    // Introduction

        System.out.println("            " + "Welcome to Sarmiento's Subs");
        System.out.println("                  " + "Sandwich Sizes!");

    // Start of input
        Scanner sizeInput = new Scanner(System.in);


    // Sandwich Size
        System.out.print("(R)egular base price is $5.45, (L)arge base price is $8.95): ");
        String sandwichSize = sizeInput.nextLine();

        System.out.println("A (" + sandwichSize + ") good choice!");

    // Customer age
        Scanner age = new Scanner(System.in);





    }
}
