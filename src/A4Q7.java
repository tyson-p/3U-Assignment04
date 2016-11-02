
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        // ask user for the speed limit
        System.out.println("Enter the Speed Limit");
        // store user input
        double limit = input.nextDouble();
        // ask user for their speed
        System.out.println("Enter the recorded speed of the car");
        // store user input
        double speed = input.nextDouble();
        //calcuale if user was going the speed limit
        if (speed <= limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (speed - limit > 0.5 && speed - limit < 21) {
            System.out.println("You are speeding and your fine is $100");
        } else if (speed - limit > 20.5 && speed - limit < 30) {
            System.out.println("You are speeding and your fine is $270");
        }
        if (speed - limit > 30.5) {
            System.out.println("You are speeding and your fine is $500");
        }
    }
}
