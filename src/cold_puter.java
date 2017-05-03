package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 03.05.2017.
 */
public class cold_puter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] temperature = new int[n];
        int counter = 0;
        for (int temperatures : temperature){
            temperatures = in.nextInt();
            if(temperatures < 0) counter++;
        }
        System.out.println(counter);
    }
}
