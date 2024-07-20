package Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] sizeOfMatrix = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int colons = Integer.parseInt(sizeOfMatrix[1]);
        int [][] matrix = new int[rows][colons];

        for (int row = 0; row < rows ; row++) {
            String [] rowOfMatrix = scanner.nextLine().split(", ");
            for (int col = 0; col < colons ; col++) {
                matrix[row][col] = Integer.parseInt(rowOfMatrix[col]);
            }
        }

        int sum = 0;
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < colons ; col++) {
                sum = sum + matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(colons);
        System.out.println(sum);


    }
}
