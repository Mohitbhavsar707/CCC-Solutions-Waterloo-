package Problems2020;

import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[][] coordinates = new int[N][2];

        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;


        for (int i = 0; i < N; i++) {
            String line = input.next();
            String[] arr = line.split(",");
            coordinates[i][0] = Integer.parseInt(arr[0]);
            coordinates[i][1] = Integer.parseInt(arr[1]);
        }

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < 1; j++) {

                if(coordinates[i][j] < minX){
                    minX = coordinates[i][j];
                }
            }
        }
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 1; j < 2; j++) {

                if(coordinates[i][j] < minY){
                    minY = coordinates[i][j];
                }
            }
        }

        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < 1; j++) {

                if(coordinates[i][j] > maxX){
                    maxX = coordinates[i][j];
                }
            }
        }
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 1; j < 2; j++) {

                if(coordinates[i][j] > maxY){
                    maxY = coordinates[i][j];
                }
            }
        }


        System.out.println((minX - 1) + "," + (minY - 1));
        System.out.println((maxX + 1) + "," + (maxY + 1));

    }
}
