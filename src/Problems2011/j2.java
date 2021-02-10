package Problems2011;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        
        /*
        Input:
        H - Humidity value (Plug this into the equation)
        M - Maximum hours she is willing to wait



        */

        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        boolean landed = false;


        for (int i = 1; i < M; i++) {
            if (((-6 * i * i * i * i) + (H * i * i * i) + (2 * i * i) + i) <= 0){
                System.out.println("The balloon first touches ground at hour: \n" + i);
                landed = true;
                break;
            }
        }

        if (landed != true){
            System.out.println("The balloon does not touch ground in the given time.");
        }
        

    }
}
