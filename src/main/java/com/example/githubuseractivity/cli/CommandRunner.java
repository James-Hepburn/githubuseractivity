package com.example.githubuseractivity.cli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandRunner implements CommandLineRunner {
    private Scanner input = new Scanner (System.in);

    @Override
    public void run (String... args) {
        System.out.println ("GitHub User Activity");

        while (true) {
            System.out.println ("\n1. Search user");
            System.out.println ("2. Quit program");

            System.out.print ("Enter an option: ");
            int option = input.nextInt ();

            if (option == 1) {
                input.nextLine ();

                System.out.println ("Enter the username: ");
                String username = input.nextLine ();

            } else if (option == 2) {
                System.out.println ("Thank you for using the program.");
                break;
            } else {
                System.out.println ("Invalid option.");
            }
        }

        System.exit (0);
    }
}