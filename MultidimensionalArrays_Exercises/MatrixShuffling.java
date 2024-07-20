package MultidimensionalArrays_Exercises;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);

        String [][] matrix = new String[rows][cols];

        fillTheMatrix(matrix, scanner);
        String command = scanner.nextLine();

        while (!command.equals("END")){

            if (!isValidCommand(command,rows,cols)){
                System.out.println("Invalid input!");
            } else {
               String [] commandPart = command.split("\\s+");
                int row1 = Integer.parseInt(commandPart[1]);
                int col1 = Integer.parseInt(commandPart[2]);
                int row2 = Integer.parseInt(commandPart[3]);
                int col2 = Integer.parseInt(commandPart[4]);

                String firstCoordinates = matrix[row1][col1];
                String  secondCoordinates = matrix[row2][col2];

                matrix[row1][col1] = secondCoordinates;
                matrix[row2][col2] = firstCoordinates;

                printMatrix(matrix,rows,cols);
            }



            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix , int rows, int cols) {
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


    private static boolean isValidCommand(String command,int rows,int cols) {
        String [] commandPart = command.split("\\s+");

        if (!commandPart[0].equals("swap")){
            return false;
        }
        if (commandPart.length != 5){
            return false;
        }

        int row1 = Integer.parseInt(commandPart[1]);
        int col1 = Integer.parseInt(commandPart[2]);
        int row2 = Integer.parseInt(commandPart[3]);
        int col2 = Integer.parseInt(commandPart[4]);

        if (row1 < 0 || row1 >= rows || col1 < 0 || col1 >= cols || row2 < 0 || row2 >= rows || col2 <0 || col2 >= cols) {
            return false;
        }
        return true;
    }

    private static void fillTheMatrix(String[][] matrix,Scanner scanner) {
        for (int row = 0; row < matrix.length ; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }
}
