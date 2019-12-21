package com.company;

public class Main {

    public static void main(String[] args) {


        sumFirstAndLastDigit(5);

    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;
        int total;

        while (number > 0) {
            firstDigit = number;
            number = number / 10;

        }

        total = firstDigit + lastDigit;
        return total;

    }
}