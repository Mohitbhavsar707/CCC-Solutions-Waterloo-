package Problems2013;

import java.util.ArrayList;
import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String start = String.valueOf(Integer.parseInt(in.nextLine()) + 1);
        //1234
        //0123

        while (true){
            boolean year = true;
            ArrayList<String> years = new ArrayList<>();

            for (int i = 0; i < start.length(); i++) {
                if(years.contains(String.valueOf(start.charAt(i)))){
                    year = false;
                    break;
                } else {
                    years.add(String.valueOf(start.charAt(i)));
                }
                
            }

            if (year){
                System.out.println(start);
                break;
            }

            start = String.valueOf(Integer.parseInt(start) + 1); 
        }
    }
}
