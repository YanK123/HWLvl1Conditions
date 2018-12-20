package yo;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;
        int days = 0;
        month = sc.nextInt();

        switch (month) {
            case 1: days = 31;
                System.out.println (days);
            break;
            case 2: days = 28;
                System.out.println (days);
            break;
            case 3: days = 31;
                System.out.println (days);
                break;
            case 4: days = 30;
                System.out.println (days);
                break;
            case 5: days = 30;
                System.out.println (days);
                break;
            case 6: days = 31;
                System.out.println (days);
                break;
            case 7: days = 30;
                System.out.println (days);
                break;
            case 8: days = 31;
                System.out.println (days);
                break;
            case 9: days = 30;
                System.out.println (days);
                break;
            case 10: days = 31;
                System.out.println (days);
                break;
            case 11: days = 30;
                System.out.println (days);
                break;
            case 12: days = 31;
                System.out.println (days);
                break;
            default: System.out.println  ("Invalid month");
                break;
        }

    }

}
