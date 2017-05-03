package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by Abror on 30.04.2017.
 */
public class Bon_Appetit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int i = 0; i<n; i++){
            c[i] = in.nextInt();
        }
        int b_charged = in.nextInt();
        c[k] = 0;
        int b_actual = IntStream.of(c).sum()/2;
        if (b_charged > b_actual || b_charged < b_actual) System.out.println(b_charged - b_actual);
        else if (b_charged == b_actual) System.out.println("Bon Appetit");

    }

}
