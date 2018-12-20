package yo;
import java.util.Scanner;


public class BmiInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double k;
        double l;
        System.out.println ("enter your weight");
        k = sc.nextDouble();
        System.out.println ("enter your height");
        l = sc.nextDouble();
        double j = k / Math.pow(l,2);
        if (j<18.5 && j>0) {
            System.out.println ("underweight");}
        if (18.5 < j && j <= 25.0 && j >0) {
            System.out.println ("normal");}
        if (j > 25.0 && j > 0) {
            System.out.println ("overweight");}
        if (j<0) { System.out.println ("error");}

    }
}
