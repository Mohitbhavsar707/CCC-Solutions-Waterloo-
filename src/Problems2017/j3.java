package Problems2017;

import java.util.Scanner;
import java.util.StringTokenizer;

public class j3 {
    public static void main(String[] args)  {
        

        Scanner in = new Scanner(System.in);

        //Get the first two x and y coodinates
        StringTokenizer start = new StringTokenizer(in.nextLine());
            int X = Integer.parseInt(start.nextToken()); int Y = Integer.parseInt(start.nextToken());

        // Get the next two x and y coodinates
        StringTokenizer end = new StringTokenizer(in.nextLine());
            int XF = Integer.parseInt(end.nextToken()); int YF = Integer.parseInt(end.nextToken());

        // Get the electrical charge capacity
        int t = Integer.parseInt(in.nextLine());


        //Check the diference between the X (Larger - smaller) and the Y (Larger - smaller)
        t -= Integer.max(X, XF) - Integer.min(X, XF);
        t -= Integer.max(Y, YF) - Integer.min(Y, YF);

        //if t is less than 0, that means that it is not possible to reach there
        if (t < 0){
            System.out.println("N");
        
            // check: if t is an even number, it is possible to reach there
        } else if (t % 2 ==0){
            System.out.println("Y");
        }  else{
            System.out.println("N");
        } 
        
    }
}
