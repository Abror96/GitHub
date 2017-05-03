package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 02.05.2017.
 */
public class veci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        String strNumb = String.valueOf(numb);
        int[] arrNumb = new int[strNumb.length()];
        for(int i = 0; i<strNumb.length(); i++){
            arrNumb[i] = Integer.parseInt(String.valueOf(strNumb.charAt(i)));
        }
        int length_arr = arrNumb.length;
        int i = length_arr-1;
        while (i>0){
            if(arrNumb[i] > arrNumb[i-1]) break;
            i--;
        }
        if(i != 0){
            int small = i;
            int j;
            for (j = i+1; j<length_arr; j++){
                if(arrNumb[j] > arrNumb[i-1] && arrNumb[j] < arrNumb[small]){
                    small = j;
                }
            }
            change(arrNumb, i-1, small);
            Arrays.sort(arrNumb, i, length_arr);
            strNumb="";
            for(int numbs : arrNumb){
                strNumb += numbs;
            }
            System.out.println(strNumb);
        } else System.out.println(0);

    }

    private static int[] change(int[] arrNumb, int a, int b) {
        int temp = arrNumb[a];
        arrNumb[a] = arrNumb[b];
        arrNumb[b] = temp;
        return arrNumb;
    }

}
