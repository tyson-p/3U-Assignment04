
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new scanner
        Scanner input = new Scanner(System.in);
        // ask user for their number of daytime minutes
        System.out.println("Number of daytime minutes?");
        // store user data
        double day = input.nextDouble();
        // ask user for their number of evening minutes
        System.out.println("Number of evening minutes?");
        // store user data
        double eve = input.nextDouble();
        // ask user for their number of weekend minutes
        System.out.println("Number of weekend minutes?");
        // store user data
        double week = input.nextDouble();
        //find out free minutes
        double priceA = 0;
        double priceB = 0;
        if (day >= 100) {
            priceA = day - 100;
        }
        //find out free minutes
        if (day >= 250) {
            priceB = day - 250;
        }
        // determine daytime minutes
        double priceA1 = priceA * 0.25;
        double priceB1 = priceB * 0.45;
        // determine evening minutes
        double priceA2 = eve * 0.15;
        double priceB2 = eve * 0.35;
        // determine weekend minutes
        double priceA3 = week * 0.20;
        double priceB3 = week * 0.25;
        // find out price of plans
        double phoneA = priceA1 + priceA2 + priceA3;
        double phoneB = priceB1 + priceB2 + priceB3;
        // tell the user the price of the plans
        System.out.println("Price of Plan A = " + phoneA);
        System.out.println("Price of Plan B = " + phoneB);
        // tell user which is the cheaper plan
        if (phoneA >= phoneB) {
            System.out.println("Plan B is the cheaper plan.");
        }
        if (phoneB >= phoneA) {
            System.out.println("Plan B is the cheaper plan.");
        }
        if (phoneA == phoneB) {
            System.out.println("Both Plans will be the same price.");
        }





    }
}
