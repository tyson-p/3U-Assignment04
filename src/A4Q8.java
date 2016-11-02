
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        int turn = 1;
        while (true) {
            // ask user for sum of dice 
            System.out.println("Enter sum of dice");
            int roll = input.nextInt();
            turn = turn + roll;
            // tell user what square they are on
            System.out.println("You are on square " + turn);
            // add the 1st ladder
            if (turn == 9) {
                turn = 34;
            }
            // add the 2nd ladder
            if (turn == 40) {
                turn = 64;
            }
            // add the 3rd ladder 
            if (turn == 67) {
                turn = 86;
            }
            // add the 1st snake
            if (turn == 54) {
                turn = 19;
            }
            // add the 2nd snake
            if (turn == 90) {
                turn = 48;
            }
            // add the 3rd snake
            if (turn == 99) {
                turn = 77;
            }
            // tell user if they reached 100 and won the game
            if (turn == 100) {
                System.out.println("You Win!");
            }
            // tell user if they quit the game
            if (roll == 0) {
                System.out.println("You Quit");
                break;
            }

        }
    }
}
