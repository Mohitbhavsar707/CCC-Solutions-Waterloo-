package Problems2019;
import java.util.Scanner;
import java.util.StringTokenizer;

public class j2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int numLines = Integer.parseInt(in.nextLine());
            
            for (int i = 0; i < numLines; i++) {
                StringTokenizer data = new StringTokenizer(in.nextLine());
                int C = Integer.parseInt(data.nextToken());
                
                String s = data.nextToken();
                StringBuilder output = new StringBuilder();

                for (int j = 0; j < C; j++) {
                    output.append(s);
                }
                System.out.println(output.toString());
            }


    }
}
