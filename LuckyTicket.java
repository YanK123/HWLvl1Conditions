package yo;
import java.util.Scanner;

public class LuckyTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String h = null;
        System.out.println ("enter your ticket number");
        number = sc.nextInt();
        int left = number / 100000 + number % 100000 / 10000 + number % 10000 / 1000;
        int right = number / 100 + number %100 /10 + number %10;
        if (number < 0 || number > 999999) {h = "error"; System.out.println (h);}
        else {boolean result = (left == right);System.out.println (result);}


    }
}
