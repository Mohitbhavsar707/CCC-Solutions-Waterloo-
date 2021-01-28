package Problems2018;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int d [] = new int[4];
        int c [] = new int [5];


        d[0] = in.nextInt();
        d[1] = in.nextInt();
        d[2] = in.nextInt();
        d[3] = in.nextInt();

        c[0] = 0;

        for (int i = 1; i < 5; i++) {
            c[i] = c[i - 1] + d[i - 1];   
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int distance = c[i] - c[j];

                if( distance < 0){
                    distance *= -1;
                }
                System.out.print(distance + " ");
            }
            System.out.println(" ");
        }
    

        


    }

}
