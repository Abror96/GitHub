package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 01.05.2017.
 */
public class Sock_merchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int counter = 0;
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        for (int i = 1; i < n; i++) {
                if (c[i] == c[i-1]) {
                    counter++;
                    i=i+1;
                }
        }
        System.out.println(counter);
    }

}
