package Problems2014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int N = Integer.parseInt(in.nextLine());
        List<String> values = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            values.add(in.nextLine());
        }
        
        int one = 100;
        int two = 100;


        for (String value : values) {
            int oneRolls = Integer.parseInt(value.split(" ")[0]);
            int twoRolls = Integer.parseInt(value.split(" ")[1]);
            if (oneRolls == twoRolls){continue;}
            if (oneRolls > twoRolls){
                two-=oneRolls;
            } else {
                one -= twoRolls;
            }            
        }

        System.out.println(one);
        System.out.println(two);
    }
}
