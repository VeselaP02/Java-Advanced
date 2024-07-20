package SetsAndMaps_Advanced_Lab;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> dataStudents = new TreeMap<>();

        for (int i = 1; i <= n ; i++) {
            String studentName = scanner.nextLine();
            double[] scores = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();

            if (!dataStudents.containsKey(studentName)){
                dataStudents.put(studentName,new ArrayList<>(){{
                    for (int j = 0; j < scores.length ; j++) {
                        add(scores[j]);
                    }
                }});
            } else {
                List<Double> currentGrades = dataStudents.get(studentName);
                for (int k = 0; k < scores.length ; k++) {
                    Double current = scores[k];
                    currentGrades.add(current);
                }
                dataStudents.put(studentName,currentGrades);
            }

            getAverageSum(scores);
            dataStudents.put(studentName,getAverageSum(scores));
        }
        for (String name: dataStudents.keySet()) {
            System.out.print(name + " is graduated with ");
            List<Double> grades = dataStudents.get(name);
            for (int i = 0; i < grades.size() ; i++) {
                System.out.println(grades.get(i));
                break;
            }
        }
    }

    private static List<Double> getAverageSum(double[] scores) {
        double sum = 0;
        List<Double> averageSum = new ArrayList<>();
        for (int i = 0; i < scores.length ; i++) {
            Double grade = scores[i];
            sum += grade;
        }
        double currentAverageSum = sum / scores.length;
        averageSum.add(currentAverageSum);
        return averageSum;
    }
}
