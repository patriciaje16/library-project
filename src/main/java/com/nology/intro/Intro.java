package com.nology.intro;

import com.nology.user.User;

import java.util.Scanner;

public class Intro {
    public static void intro() {
        Scanner scanner = new Scanner(System.in);
        int optionSelected;

        System.out.println("Select 1 for Login");
        System.out.println("Select 2 for User Registration");
        System.out.println("Select 3 to Exit");
        System.out.print("Enter selected option: ");
        optionSelected = scanner.nextInt();

        if (optionSelected == 1) {
            // proceed with login
            System.out.println("Login in progress\n");
        } else if (optionSelected == 2) {
            User.register();
            System.out.println();
            System.out.println("Registration in progress\n");
        }else if (optionSelected == 3){
            scanner.close();
        }else {
            System.out.println("Please select valid option");
            intro();
        }
    }
}


