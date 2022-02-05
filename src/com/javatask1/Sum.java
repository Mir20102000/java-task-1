package com.javatask1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    protected int number, mod, sumOfDigits;

    Sum () {
    }

   public void SumOfDigits () {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your number: ");
            this.number = scanner.nextInt();
            while (this.number != 0) {
                this.mod = this.number % 10;
                this.sumOfDigits += this.mod;
                this.number = this.number / 10;
            }
            System.out.print("Sum of digits: " + sumOfDigits);
        }
        catch (InputMismatchException e) {
            System.out.println("You must enter the number!");
            SumOfDigits();
        }
   }
}
