package yo;
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardA;
        int cardB;
        int BlackJackScore ;
        System.out.println("Enter your first card value");
        cardA = sc.nextInt();
        System.out.println("Enter your second card value");
        cardB = sc.nextInt();
        if (cardA  <= 0) {BlackJackScore = 0;System.out.println("error");}
        if (cardB <= 0) {BlackJackScore = 0;System.out.println("error");}
        if (cardA > 21) {BlackJackScore = 0;System.out.println("Your Score: " + BlackJackScore);}
        if (cardB > 21) {BlackJackScore = 0;System.out.println("Your Score: " + BlackJackScore);}
        if (cardA > cardB && cardB > 0) {BlackJackScore = cardA;System.out.println("Your Score: " + BlackJackScore);}
        if (cardB > cardA && cardA > 0) {BlackJackScore = cardB; System.out.println("Your Score: " + BlackJackScore);}



    }
}