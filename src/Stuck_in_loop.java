package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 02.05.2017.
 */
public class Stuck_in_loop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i+" Abracadabra");
        }
    }

}
