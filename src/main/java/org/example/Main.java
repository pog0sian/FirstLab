package org.example;

import com.sun.source.doctree.SummaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println(fizzBuzz(500));
        System.out.println(seriesSum());

    }

    public static ArrayList<String> fizzBuzz(int n) {

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0 && i % 3 == 0) {
                list.add("fizzbuzz");
            } else if (i % 5 == 0) {
                list.add("fizz");
            } else if (i % 7 == 0) {
                list.add("buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    public static String Reverse(String input) {

        char[] chars = input.toCharArray();
        String str = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            str += chars[i];
        }
        return str;
    }

    public static ArrayList<String> Discrimant (int a, int b, int c) {

        ArrayList<String> list = new ArrayList<>();
        int D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            list.add(String.valueOf(x1));
            list.add(String.valueOf(x2));
        }
        else if (D == 0) {
            double x = (-b) / (2 * a);
            list.add(String.valueOf(x));
        }
        else {
            list.add(String.valueOf("Нет корней"));
        }

        return list;
    }

    public static ArrayList<String> seriesSum () {

        ArrayList<String> list = new ArrayList<>();

        int n = 2;
        double sum = 0;
        double i = 0;

        do {
            i = 0;

            i = (double) 1 / (n * n + n - 2);
            sum +=  i;

            n++;
        } while (i > Math.pow(10, -6));

        list.add(String.valueOf(sum));

        return list;
    }

    public static boolean palindrom(String input) {

        Scanner scanner = new Scanner(input.toLowerCase());

        char[] chars = input.toCharArray();
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += chars[i];
    }
        return input.equals(rev);
    }
}