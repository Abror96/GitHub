package com.magic.square;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Abror on 29.04.2017.
 */
public class Day_of_the_programmer {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        LocalDate d = LocalDate.ofYearDay(year, 256);
        if(year == 1918){
            d = LocalDate.of(1918, 2, 14).plusDays(224);
        }
        else if(year < 1918 && year % 4 == 0 && !d.isLeapYear()){
            d = d.minusDays(1);
        }
        String p = "dd.MM.yyyy";
        DateTimeFormatter f = DateTimeFormatter.ofPattern(p);
        System.out.println(d.format(f));
    }



//    private static void solve(int year){
//        int days_without_february = 215; // the sum of all days of months without february
//        int day_of_programmer = 0;
//
//        if(year < 1918){
//            if (year%4 == 0) day_of_programmer = days_without_february + 29;
//            else day_of_programmer = days_without_february + 28;
//        } else if ( year > 1918 ){
//            if (year%4 == 0){
//                if ((year%100 != 0) || (year%400 == 0)){
//                    day_of_programmer = days_without_february + 29;
//                } else day_of_programmer = days_without_february + 28;
//            } else day_of_programmer = days_without_february + 28;
//        } else day_of_programmer = days_without_february + 15;
//
//
//
//
//        day_of_programmer = 256 - day_of_programmer;
//        System.out.println(String.valueOf(day_of_programmer+".09."+year));
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int year = in.nextInt();
//        solve(year);
//    }

}
