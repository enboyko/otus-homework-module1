package ru.otus.java.basic.lesson15.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee vasiya = new Employee("Vasiya", 20);
        Employee ivan = new Employee("Ivan", 30);
        Employee marina = new Employee("Marina", 50);
        Employee mehalich = new Employee("Mehalich", 60);

        employees.add(vasiya);
        employees.add(ivan);
        employees.add(marina);
        employees.add(mehalich);

        System.out.println();
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + "       Age: " + employee.getAge());
        }
        System.out.println("============================================================================");
        System.out.println("Task 1 :");
        System.out.println("Employees' names:");
        System.out.println(getEmployeesNames(employees));
        System.out.println("============================================================================");
        System.out.println("Task 2 :");
        int ageToBeComparedWith = 40;
        System.out.println("Employees with ages above " + ageToBeComparedWith + ":");
        System.out.println();
        List<Employee> emplsWithAgesAbove = getEmployeesWithAgesAbove(employees, ageToBeComparedWith);
        for (Employee employee : emplsWithAgesAbove) {
            System.out.println("Name: " + employee.getName() + "       Age: " + employee.getAge());
        }
        System.out.println("============================================================================");
        System.out.println("Task 3 :");
        System.out.println("============================================================================");
        int minimumAverageAge = 35;
        boolean isAbove = checkEmployeesMinimumAverageAge(employees, minimumAverageAge);
        System.out.println("Is employees' counted average age above " + minimumAverageAge + "? " + isAbove);
        System.out.println("============================================================================");
        System.out.println("Task 4 :");
        System.out.println("The youngest employee is: ");
        System.out.println(findYoungestEmployee(employees).toString());
        System.out.println("============================================================================");
    }


    private static List<String> getEmployeesNames(List<Employee> list) {
        List<String> names = new ArrayList<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            names.add(employee.getName());
        }
        return names;
    }

    private static List<Employee> getEmployeesWithAgesAbove(List<Employee> list, int ageForComparison) {
        List<Employee> olderEmployees = new ArrayList<>();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee temporaryEmployee = (Employee) iterator.next();
            if (temporaryEmployee.getAge() > ageForComparison) {
                olderEmployees.add(temporaryEmployee);
            }
        }
        return olderEmployees;
    }

    private static boolean checkEmployeesMinimumAverageAge(List<Employee> list, int minAverAge) {
        int ageSum = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee temporaryEmployee = (Employee) iterator.next();
            ageSum += temporaryEmployee.getAge();
        }
        int countedMinAverAge = ageSum / list.size();
        System.out.println("Employees' counted average age: " + countedMinAverAge);
        if (countedMinAverAge > minAverAge) {
            return true;
        }
        return false;
    }

    private static Employee findYoungestEmployee(List<Employee> list) {
        int smallestAge = list.get(0).getAge();
        Employee youngestEmployee = list.get(0);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = (Employee) iterator.next();
            if (employee.getAge() < smallestAge) {
                smallestAge = employee.getAge();
                youngestEmployee = employee;
            }
        }
        return youngestEmployee;
    }
}
