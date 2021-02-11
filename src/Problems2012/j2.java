package Problems2012;

import java.util.ArrayList;
import java.util.Scanner;

public class j2{
    public static void main(String[] args) {
       

        Scanner in = new Scanner(System.in);

        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int four = in.nextInt();

// 1 1 1 1        
// 1 2 3 4
// 4 3 2 1
        
        if (one == two && two == three && three == four && four == one){
            System.out.println("Fish At Constant Depth");
        } else if (one < two && two < three && three < four){
            System.out.println("Fish Rising");
        } else if (one > two && two > three && three > four){
            System.out.println("Fish Diving");
        } else {
            System.out.println("No Fish");
        }
        



    }
}