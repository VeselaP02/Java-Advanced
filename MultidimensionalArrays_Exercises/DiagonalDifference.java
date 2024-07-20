package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[n][n];

        fillTheMatrix(matrix,scanner);

        int sumPrimaryDiagonal = getSumPrimary(matrix);
        int sumSecondaryDiagonal = getSumSecondary(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }

    private static int getSumSecondary(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                int currentElement = matrix[row][col];

                if (col == matrix.length - row - 1){
                    sum += currentElement;
                }

            }
        }
        return sum;
    }

    private static int getSumPrimary(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                int currentElement = matrix[row][col];
                if (row == col){
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static void fillTheMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
