package Problems2016;

import java.util.Scanner;

public class j2 {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
        boolean magic = true;
        //will use this to compare if its magic or not


        // used to add the numbers to the array - using the split method to keep space and make the matrix
        String[] lineOne = in.nextLine().split(" ");
        String[] lineTwo = in.nextLine().split(" ");
        String[] lineThree = in.nextLine().split(" ");
        String[] lineFour = in.nextLine().split(" ");


        // total used to find the sums 
        int total = Integer.parseInt(lineOne[0]) + Integer.parseInt(lineTwo[0]) +
                Integer.parseInt(lineThree[0]) + Integer.parseInt(lineFour[0]);

                
        String[][] lines = {lineOne, lineTwo, lineThree, lineFour};

        for (int i = 0; i < 4; i++){
            if ((Integer.parseInt(lineOne[i]) + Integer.parseInt(lineTwo[i]) +
                    Integer.parseInt(lineThree[i]) + Integer.parseInt(lineFour[i])) != total)
                    {
                      magic = false;
                      break;
                    }
                    
            int temp = 0;
            for (String num: lines[i]){
                temp += Integer.parseInt(num);
            }
            if (temp != total){
                magic = false;
                break;
            }

        }


        System.out.println(
                (magic)? "magic":"not magic"
        );

    }
}

