package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>> departments = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            String [] dataEmployee = scanner.nextLine().split("\\s+");
            String name = dataEmployee[0];
            double salary = Double.parseDouble(dataEmployee[1]);
            String position = dataEmployee[2];
            String department = dataEmployee[3];
            Employee employee = null;
            if (dataEmployee.length == 6) {
                String email = dataEmployee[4];
                int age = Integer.parseInt(dataEmployee[5]);
                employee = new Employee(name,salary,position,department,email,age);
            } else if (dataEmployee.length == 4) {
                 employee = new Employee(name,salary,position,department);
            } else if (dataEmployee.length == 5) {
                String forthParameter = dataEmployee[4];
                if (forthParameter.contains("@")){
                   String email = forthParameter;
                   employee = new Employee(name,salary,position,department,email);
                } else {
                    int age = Integer.parseInt(forthParameter);
                    employee = new Employee(name,salary,position,department,age);
                }
            }

            if (!departments.containsKey(department)){
                departments.put(department,new ArrayList<>());
                departments.get(department).add(employee);
            } else {
                departments.get(department).add(employee);
            }
        }

        String maxAverageSalaryDepartment = departments.entrySet().stream().max(Comparator.comparingDouble(entry ->getAverageSum(entry.getValue())))
                .get().getKey();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment);
        List<Employee> employees = departments.get(maxAverageSalaryDepartment);
        employees.sort(Comparator.comparingDouble(employee -> employee.getSalary()));
        Collections.reverse(employees);

        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    private static double getAverageSum(List<Employee> employeeList) {
        double sum = 0;
        for (Employee employee:employeeList) {
            double salary = employee.getSalary();
            sum += salary;
        }
        return sum / employeeList.size();
    }
}
