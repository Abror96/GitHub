package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 28.04.2017.
 */
public class Divisible_sum_pairs {

    private static void solve(int[] a, int k) {

        int count = 0;

        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length; j++){
                if(i<j){
                    if((a[i]+a[j])%k ==0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        solve(a, k);
    }

}
