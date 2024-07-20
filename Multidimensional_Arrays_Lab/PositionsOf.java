package Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] sizeOfMatrix = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int colons = Integer.parseInt(sizeOfMatrix[1]);
        int [][] arr = new int[rows][colons];

        for (int row = 0; row < rows  ; row++) {
            int [] rowMatrix = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            arr [row] = rowMatrix;

        }

        boolean foundOrNot = false;
        int num = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < colons ; col++) {
                if (arr [row][col] == num){
                    System.out.println(row + " " + col);
                    foundOrNot = true;
                }
            }
        }
        if (!foundOrNot){
            System.out.println("not found");
        }
    }
}
