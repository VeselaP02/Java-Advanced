package Functional_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String [] input = scanner.nextLine().split(", ");

        System.out.println("Prices with VAT:");
      List<Double> vatNumbers =  Arrays.stream(input).map(e -> Double.parseDouble(e))
                .map(e -> e * 1.2).collect(Collectors.toList());

      vatNumbers.stream().forEach(e -> System.out.printf("%.2f%n",e));
    }
}
