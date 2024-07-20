package Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int colons = Integer.parseInt(scanner.nextLine());
        char [] [] firstMatrix = new char[rows][colons];

        for (int row = 0; row < rows ; row++) {
            String [] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < colons ; col++) {
                firstMatrix[row][col] = rowData[col].charAt(0);
            }
        }

        char [] [] secondMatrix = new char[rows][colons];

        for (int row = 0; row < rows ; row++) {
            String [] rowDataSecond = scanner.nextLine().split("\\s+");
            for (int col = 0; col < colons; col++) {
                secondMatrix[row][col] = rowDataSecond[col].charAt(0);
            }
        }

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < colons; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]){
                    System.out.print(secondMatrix[row][col] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
