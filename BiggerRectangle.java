package yo;
import java.util.Scanner;

public class BiggerRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height1;
        int height2;
        int width1;
        int width2;
        int result;
        height1 = sc.nextInt();
        height2 = sc.nextInt();
        width1 = sc.nextInt();
        width2 = sc.nextInt();
        if (height1 * width1 < height2 *width2 &&  height2 * width2 > 0 && height1 * width1 >0) {
            result =1 ; System.out.println(result);}
        if (height1 * width1 > height2 * width2 && height2 * width2 > 0 && height1 * width1 >0 ) {
            result =2 ; System.out.println(result);}
        else {System.out.println("error");}

    }
}
