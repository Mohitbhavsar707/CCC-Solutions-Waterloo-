package Problems2014;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int V = Integer.parseInt(in.nextLine());
        String[] votes = in.nextLine().split("");
        int A = 0;
        int B = 0;

        for (int i = 0; i < votes.length; i++) {
            if(votes[i].equals("A")){
                A++;
            } else if (votes[i].equals("B")){
                B++;
            }
        }
        
        if (A > B){
            System.out.println("A");
        } else if( B > A){
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }

    }
}
