package Problems2019;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numLines = Integer.parseInt(in.nextLine());

        for (int i = 0; i < numLines; i++) {
            StringBuilder data = new StringBuilder(in.nextLine());
            String line = in.nextLine();
            String current = String.valueOf(line.charAt(0));

            int numChars = 0;

            for (int j = 0; j < line.length(); j++) {
                String character = String.valueOf(line.charAt(j));
                if(character.equals(current)){
                    numChars++;
                    continue;
                }

                data.append(numChars);
                data.append(" ");
                data.append(current);
                data.append(" ");
                numChars = 1;
                current = character;
                
            }

            data.append(numChars);
            data.append(" ");
            data.append(current);
            System.out.println(data.toString());

        }

    }
}
