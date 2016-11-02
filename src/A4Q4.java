
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // print first line for user input
        System.out.println("How much does the food for prom cost? ");
        // store user data
        double food = input.nextDouble();
        // print second line for user input
        System.out.println("How much does the DJ cost?");
        // take user input
        double dj = input.nextDouble();
        // print third line for user input
        System.out.println("How much does it cost to rent the hall?");
        // take user input
        double hall = input.nextDouble();
        // print forth line for user input
        System.out.println("How much does decorations cost? ");
        // take user input
        double decor = input.nextDouble();
        // print fifth line for user input
        System.out.println("How much does it cost for staff?");
        // take user input
        double staff = input.nextDouble();
        // print sixth line for user input
        System.out.println("How much for miscellaneous costs?");
        // take user input
        double m = input.nextDouble();
        //take all cost and add them up
        double total = (food + dj + hall + decor + staff + m);
        // divide user cost by ticket price
        double ticket = (total / 35);
        // round ticket price
        ticket = Math.ceil(ticket);
        // print how much total is and how many tickets must be sold
        System.out.println("The total cost is " + total + ". You will need to sell " + ticket + " tickets to break even.");





    }
}
