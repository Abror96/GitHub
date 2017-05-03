package com.magic.square;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Abror on 27.04.2017.
 */
public class Apple_and_Orange {

    private static void solve(int s, int t, int a, int b, int[] apple, int[] orange) {
        int apple_dist[] = new int[apple.length];
        int orange_dist[] = new int[orange.length];
        int apple_count = 0;
        int orange_count = 0;
        for ( int i = 0; i<apple.length; i++){
            apple_dist[i] = a + apple[i];
        }
        for (int i = 0; i<orange.length; i++){
            orange_dist[i] = b + orange[i];
        }
        for (int i = 0; i<apple_dist.length; i++){
            if (apple_dist[i] >= s && apple_dist[i] <= t ) {
                apple_count++;
            }
        }
        System.out.println(apple_count);
        for (int i = 0; i<orange_dist.length; i++){
            if (orange_dist[i] >= s && orange_dist[i] <= t ) {
                orange_count++;
            }
        }
        System.out.println(orange_count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // start of red zone
        int t = in.nextInt(); // end of red zone
        int a = in.nextInt(); // value of apple tree
        int b = in.nextInt(); // value of orange tree
        int m = in.nextInt(); // quantity of fell apples
        int n = in.nextInt(); // quantity of fell oranges
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        solve(s, t, a, b, apple, orange);
    }



}
