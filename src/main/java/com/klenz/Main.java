package com.klenz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter name:  ");
        Scanner scanner = new Scanner(System.in);
        HomeWork1 assignment1 = new HomeWork1();
        String userInput = scanner.next();
        assignment1.typeToUpperCase(userInput);
        System.out.println(assignment1.reverse(userInput));
        assignment1.vowelCount(userInput);
        System.out.println(assignment1.isPalindrome(userInput));

        scanner.close();
    }


    }

