package com.magic.square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 28.04.2017.
 */
public class Between_two_sets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        
        int maxa = 0;
        int minb = 1000000;
        
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
            if(maxa < a[i])
                maxa = a[i];
        }
        System.out.println(maxa);
        
        int[] b = new int[m];
        
        for(int i=0; i < m; i++){
            b[i] = in.nextInt();
            if(minb > b[i])
                minb = b[i];
        }
        System.out.println(minb);
        
        int result = 0;
        int x = 0;
        for(x = maxa; x <= minb; x++){
            int count = 0;
            for(int i = 0; i < n; i++){
                if(x % a[i] != 0)
                    break;
                else
                    count++;
            }
            if(count == n){
                for(int i = 0; i < m; i++){
                    if(b[i] % x != 0)
                        break;
                    else
                        count++;
                }
            }
            if(count == (m+n))
                result++;
        }
        System.out.println(result);
    }


}
