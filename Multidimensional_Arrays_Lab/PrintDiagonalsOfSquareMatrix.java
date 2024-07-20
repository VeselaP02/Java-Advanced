package Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int [][] matrix =new int[rows][rows];


        for (int row = 0; row < rows ; row++) {
            int [] dataRows = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            matrix[row] = dataRows;

        }

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < rows; col++) {
                if (row == col){
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();

        for (int col = 0; col < rows ; col++) {
            System.out.print(matrix[rows - 1 - col][col] + " ");
        }

    }
}
