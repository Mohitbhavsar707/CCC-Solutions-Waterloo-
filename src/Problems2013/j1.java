package Problems2013;

import java.util.Scanner;

public class j1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int young = in.nextInt();
        int middle = in.nextInt();

        int old = 0;
        int difference = 0;

    

            difference = middle - young;
            old = middle + difference;
            System.out.println(old);
        
    }
}
