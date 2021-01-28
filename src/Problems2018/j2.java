package Problems2018;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
        String[] lineOne = in.nextLine().split("");
        String[] lineTwo = in.nextLine().split("");

        int count = 0;

       for (int i = 0; i < N; i++) {
           String one = lineOne[i];
           String two = lineTwo[i];
           if(one.equals("C") && two.equals("C")){
               count++;
           }
       }

       System.out.println(count);
        
    }
}
