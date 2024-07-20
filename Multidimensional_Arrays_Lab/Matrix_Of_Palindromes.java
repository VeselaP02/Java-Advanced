package Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int colons = scanner.nextInt();

        String [][] matrix = new String[rows][colons];

        char startLetter = 'a';
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < colons; col++) {

                String palindromes = "" + startLetter + (char)(startLetter + col) + startLetter;
                matrix[row][col] = palindromes;
            }
            startLetter = (char)(startLetter + 1);
        }
        printMatrix(matrix,rows,colons);
    }

    private static void printMatrix(String[][] matrix,int rows, int cols) {
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
