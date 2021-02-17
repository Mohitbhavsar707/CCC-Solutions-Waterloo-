package Problems2013;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();
        String letters = "IOSHZXN";
        boolean contain = true;
        

        for (int i = 0; i < line.length(); i++) {
            if (!letters.contains(String.valueOf(line.charAt(i)))){
                contain = false;
                System.out.println("NO");
                break;
            } 
            
        }

        if (contain){
            System.out.println("YES");
        }
    }
}
