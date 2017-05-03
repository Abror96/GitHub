package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 27.04.2017.
 */
public class Grading_Students {

    static void solve(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < 38) System.out.println(grades[i]);
            else {
                int newGrades = grades[i] + (5-(grades[i] % 5));
                if(newGrades - grades[i] < 3) System.out.println(newGrades);
                else System.out.println(grades[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        solve(grades);

    }

}
