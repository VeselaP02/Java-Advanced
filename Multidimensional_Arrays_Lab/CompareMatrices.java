package Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstMatrixSize = scanner.nextLine().split(" ");
        int FirstRows = Integer.parseInt(firstMatrixSize[0]);
        int FirstColons = Integer.parseInt(firstMatrixSize[1]);
        int [][] firstMatrix = new int[FirstRows][FirstColons];

        for (int row = 0; row < FirstRows ; row++) {
            int [] firstData = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            firstMatrix[row] = firstData;
        }
        String [] secondMatrixSize = scanner.nextLine().split(" ");
        int secondRows = Integer.parseInt(secondMatrixSize[0]);
        int secondColons = Integer.parseInt(secondMatrixSize[1]);
        int [][] secondMatrix = new int[secondRows][secondColons];

        if (FirstRows != secondRows || FirstColons != secondColons){
            System.out.println("not equal");
            return;
        }
        for (int row = 0; row < secondRows; row++) {
            String[] currentMatrix = scanner.nextLine().split(" ");
            for (int col = 0; col < secondColons; col++) {
                secondMatrix[row][col] = Integer.parseInt(currentMatrix[col]);
            }
        }
            for (int rows = 0; rows < secondRows; rows++) {
                for (int col = 0; col < secondColons ; col++) {
                    if (firstMatrix[rows][col] != secondMatrix[rows][col]){
                        System.out.println("not equal");
                        return;
                    }
                }
            }
        System.out.println("equal");
    }
}
