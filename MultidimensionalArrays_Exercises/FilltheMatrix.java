package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class FilltheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];

        int [][] matrix = new int[size][size];

        if (pattern.equals("A")){
            fillPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix.length ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPatternB(int[][] matrix) {
        int currentNumber = 1;
            for (int col = 0; col < matrix.length ; col++) {
                if (col %2 == 0){
                for (int row = 0; row < matrix.length ; row++) {
                    matrix[row][col] = currentNumber;
                    currentNumber++;
                }
            } else {
                    for (int row = matrix.length - 1; row >=0 ; row--) {
                        matrix[row][col] = currentNumber;
                        currentNumber++;
                    }
                }
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int currentNumber = 1;
        for (int col = 0; col < matrix.length ; col++) {
            for (int row = 0; row < matrix.length ; row++) {
                matrix[row][col] = currentNumber;
                currentNumber++;
            }
        }
    }
}
