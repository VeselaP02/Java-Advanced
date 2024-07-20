package Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(input[0]);
        int colons = Integer.parseInt(input[1]);

        int [][] matrix = new int[rows][colons];

        fillTheMatrix(matrix,scanner,rows);

        int maxSum = Integer.MIN_VALUE;
        int bestStartRow = 0;
        int bestStartCol = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < colons - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > maxSum){
                    maxSum = sum;
                    bestStartRow = row;
                    bestStartCol = col;
                }
            }
        }
        printMatrix(matrix,bestStartRow,bestStartCol);
        System.out.println(maxSum);

    }

    private static void printMatrix(int[][] matrix,int bestRow,int bestCol) {
        for (int row = bestRow; row <= bestRow + 1 ; row++) {
            for (int col = bestCol; col <= bestCol + 1 ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(int[][] matrix,Scanner scanner,int rows) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
    }
}

