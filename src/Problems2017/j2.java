package Problems2017;


import java.util.Scanner;

public class j2 {
    
    public static void main(String[] args)  {
        
        Scanner in = new Scanner(System.in);
        int sum = 0;

        StringBuilder N = new StringBuilder(in.nextLine());
        int K = Integer.parseInt(in.nextLine());
        for (int i = 0; i <= K; i++)
        {
            sum += Integer.parseInt(N.toString());
            N.append(0);
        }
        System.out.println(sum);
    }
}
