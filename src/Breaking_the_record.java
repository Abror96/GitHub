package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 28.04.2017.
 */
public class Breaking_the_record {

    static int[] getRecord(int[] s){
        // Complete this function
        int count_high_score = 0;
        int count_low_score = 0;
        int max = s[0];
        int min = s[0];
        for (int value : s) {
            if (value > max) {
                max = value;
                count_high_score++;
            } else if (value < min) {
                min = value;
                count_low_score++;
            }
        }
        return new int[] {count_high_score, count_low_score};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
