package algorithms;

import java.util.Scanner;

public class SumTwo {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
    }
    static int sumOfTwoDigits(int first, int second) {
        return first + second;
    }

}
