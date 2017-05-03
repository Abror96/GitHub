package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 29.04.2017.
 */
public class Migratory_birds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for (int types_i = 0; types_i < n; types_i++) {
            types[types_i] = in.nextInt();
        }
        // your code goes here
        int maxIndex = 0;
        int[] count_of_types = new int[5];
        for (int type : types) {
            count_of_types[type - 1]++;
        }
        int max = 0;
        for (int i = 0; i < count_of_types.length; i++) {
            if (max < count_of_types[i]) {
                max = count_of_types[i];
                maxIndex = i;
            }
        }
        System.out.println(maxIndex + 1);
    }

}
