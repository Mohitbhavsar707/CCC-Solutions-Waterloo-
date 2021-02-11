package Problems2012;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        
        /*

        Pattern that needs to be made:
        *x*
         xx
        * *

        Scale Factor = K --> The input

        Scale factor of 3:

        
        */

        Scanner in = new Scanner(System.in);
        int K = Integer.parseInt(in.nextLine());

        String star = "*";
        String x = "x";
        String none = " ";

        for (int i = 1; i < K; i++){
            star += "*";
            x += "x";
            none += " ";
        }

        for (int i = 0; i < K; i++){
            System.out.println(star + x + star);
        }
        for (int i = 0; i < K; i++){
            System.out.println(none + x + x);
        }
        for (int i = 0; i < K; i++){
            System.out.println(star + none + star);
        }
    }
}
