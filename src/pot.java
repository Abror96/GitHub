package com.magic.square;

import java.util.Scanner;

public class pot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i<n; i++){
            numbers[i] = in.next();
        }
        int total = 0;
        for (int i = 0; i<n; i++){
            total += (int) Math.pow(Integer.valueOf(String.valueOf(numbers[i].substring(0,numbers[i].length()-1))),
            Integer.valueOf(String.valueOf(numbers[i].charAt(numbers[i].length()-1))));
        }
        System.out.println(total);
    }

}
