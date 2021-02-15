package Problems2020;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Receive the input (the three letters from the user)
        int S = in.nextInt();
        int M = in.nextInt();
        int L = in.nextInt();

        // insert the input into the equation provided and check if the sum is greater than or equal to 10
        //  if it is, then print "happy", else, "sad"
        if ((S + (2*M) + (3*L)) >= 10){
            System.out.println("happy");
        } else{
            System.out.println("sad");
        }


    }
}
