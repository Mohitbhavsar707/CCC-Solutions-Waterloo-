package Problems2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j2 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        StringBuilder N = new StringBuilder(in.readLine());
        int K = Integer.parseInt(in.readLine());
        for (int i = 0; i <= K; i++)
        {
            sum += Integer.parseInt(N.toString());
            N.append(0);
        }
        System.out.println(sum);
    }
}
