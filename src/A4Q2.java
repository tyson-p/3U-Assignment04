
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        // ask user for their measurement in inches
        System.out.println("Please enter the measurement in inches you wish to convert");
        // get the measurement from the user and store it
        int number = input.nextInt();
        // take user input and multiply by 2.54
        double conversion = (number * 2.54);
        // print input and converted answer back to user 
        System.out.println(number + " inches is the same as " + conversion + " cm.");







    }
}
