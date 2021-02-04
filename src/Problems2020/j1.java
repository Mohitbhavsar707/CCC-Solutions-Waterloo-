package Problems2020;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int S = in.nextInt();
        int M = in.nextInt();
        int L = in.nextInt();

        if ((S + (2*M) + (3*L)) >= 10){
            System.out.println("happy");
        } else{
            System.out.println("sad");
        }


    }
}
