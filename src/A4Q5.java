
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petet9087
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new scanner
        Scanner input = new Scanner(System.in);
        // ask what first test was out of
        System.out.println("What was the first test out of?");
        // user data
        double t1 = input.nextDouble();
        // ask what user mark was
        System.out.println("What mark did you get?");
        // user data
        double m1 = input.nextDouble();
        // ask what second test was out of
        System.out.println("What was the second test out of?");
        // user data
        double t2 = input.nextDouble();
        // ask what user mark was
        System.out.println("What mark did you get?");
        // user data
        double m2 = input.nextDouble();
        // ask what third test was out of
        System.out.println("What was the third test out of?");
        // user data
        double t3 = input.nextDouble();
        // ask what user mark was
        System.out.println("What mark did you get?");
        // user data
        double m3 = input.nextDouble();
        // ask what forth test was out of
        System.out.println("What was the forth test out of?");
        // user data
        double t4 = input.nextDouble();
        // ask what user mark was
        System.out.println("What mark did you get?");
        // user data
        double m4 = input.nextDouble();
        // ask what fifth test was out of
        System.out.println("What was the fifth test out of?");
        // user data
        double t5 = input.nextDouble();
        // ask what user mark was
        System.out.println("What mark did you get?");
        // user data
        double m5 = input.nextDouble();
        // show test score average
        System.out.println("Test Scores for User: ");
        // get test 1 percent
        double a1 = ((m1 / t1) * 100);
        // shopw user test score average
        System.out.println("Test 1: " + a1);
        // get test 2 percent
        double a2 = ((m2 / t2) * 100);
        // shopw user test score average
        System.out.println("Test 1: " + a2);
        // get test 3 percent
        double a3 = ((m3 / t3) * 100);
        // shopw user test score average
        System.out.println("Test 1: " + a3);
        // get test 4 percent
        double a4 = ((m4 / t4) * 100);
        // shopw user test score average
        System.out.println("Test 1: " + a4);
        // get test 5 percent
        double a5 = ((m5 / t5) * 100);
        // shopw user test score average
        System.out.println("Test 1: " + a5);
        // get total percent and divide by 5
        double total = ((a1 + a2 + a3 + a4 + a5) / 5);
        // print average percent back to user
        System.out.println("Average: " + total + "%");

    }
}
