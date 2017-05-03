package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 03.05.2017.
 */
public class chess {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pieces = new int[6];
        for(int i = 0; i<6; i++){
            pieces[i] = in.nextInt();
        }
        System.out.print(1-pieces[0]+" ");
        System.out.print(1-pieces[1]+" ");
        for(int i = 2; i<5; i++) System.out.print(2-pieces[i]+" ");
        System.out.print(8-pieces[5]);

    }

}
