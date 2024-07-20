package SetsAndMaps_Advanced_Lab;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentRecord = new TreeMap<>();
        Map<String, Double> averageSum = new TreeMap<>();

        for (int row = 1; row <= n; row++) {
            String input = scanner.nextLine();
            String studentName = input.split("\\s+")[0];
            Double grade = Double.parseDouble(input.split("\\s+")[1]);


            if (!studentRecord.containsKey(studentName)) {
                studentRecord.put(studentName, new ArrayList<>() {
                    {
                        add(grade);
                    }
                });

            } else {
                List<Double> currentGrades = studentRecord.get(studentName);
                currentGrades.add(grade);
                studentRecord.put(studentName, currentGrades);

            }

            Double totalSum = getAverageSum(studentRecord.get(studentName));
            if (!averageSum.containsKey(studentName)) {
                averageSum.put(studentName, totalSum);
            } else {
                averageSum.put(studentName, totalSum);
            }

        }

        for (String name : studentRecord.keySet()) {
            System.out.print(name + " -> ");
            List<Double> grades = studentRecord.get(name);
            for (int i = 0; i < grades.size(); i++) {
                Double currentGrade = grades.get(i);
                System.out.printf("%.2f ",currentGrade);
            }
            System.out.printf("(avg: %.2f)%n",averageSum.get(name));

        }
    }

    private static double getAverageSum(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size() ; i++) {
            double currentGrade = list.get(i);
            sum += currentGrade;
        }
          return  sum/ list.size();

    }

}
