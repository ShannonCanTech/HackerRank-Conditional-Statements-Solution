package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = 0;

        System.out.println("Enter a number: ");
        N = scan.nextInt();
        scan.nextLine();

            if(N % 2 == 0 && N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N % 2 == 0 && N >= 6 && N <= 20){
                    System.out.println("Weird");
            } else if (N % 2 == 0){
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
    }
}
