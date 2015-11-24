/*
 *Fibonacci Sequence - Enter a number and have the program generate the 
 *Fibonacci sequence to that number or to the Nth number.
 */
package fibonaccisequence;

import java.util.Scanner;

/**
 *
 * @author Dan Bennett
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of digits in the Fibonacci Sequence you would like to"
                + " view.  (No more than 50 digits.)");
        Scanner ip = new Scanner(System.in);
        int ip1 = ip.nextInt();
        
        long v1 = 0;
        long v2 = 1;
        long v3;
        
        if (ip1 <= 0) {
            System.out.println("The number you entered is less than 0.  "
                    + "Program closing");
        }else if (ip1 == 1) {
            System.out.println("The Fibonacci Sequence to " + ip1 + " digits "
                    + "is:");
            System.out.println(v1);
        }else if (ip1 == 2) {
            System.out.println("The Fibonacci Sequence to " + ip1 + " digits "
                    + "is:");
            System.out.println(v1);
            System.out.println(v2);
        }else if (ip1 <= 50){
            System.out.println("The Fibonacci Sequence to " + ip1 + " digits "
                    + "is:");
            System.out.println(v1);
            System.out.println(v2);
            for(int i=0; i+2 < ip1; i++){
                v3 = v1 + v2;
                System.out.println(v3);
                v1 = v2;
                v2 = v3;
            }
        }else {
            System.out.println("The number you entered is larger than 50.  "
                    + "Program closing");
        }
    }
    
}
