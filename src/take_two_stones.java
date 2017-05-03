package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 02.05.2017.
 */
public class take_two_stones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R1 = in.nextInt();
        int S = in.nextInt();
        int R2 = S*2 - R1;
        System.out.println(R2);
    }

}
