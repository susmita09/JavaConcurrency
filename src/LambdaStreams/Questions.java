package LambdaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Questions {
    public static void main(String[] args) {
//        Get the Noida city employees from EmployeeList and sort the
//        Noida city employees in the reverse alphabetically order by name of the employee using Java 8
//        Employee{
//            id,
//            name,
//            city;}
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Amit", "Noida",400,"HR"),
                new Employee(2, "Rahul", "Delhi",900,"HTech"),
                new Employee(3, "Sneha", "Noida",4007,"Sales"),
                new Employee(4, "Varun", "Noida",40056,"manager"),
                new Employee(5, "Karan", "Mumbai",9890,"HR")
        ); //empReo.getEmployeeByCityName("Noida")

//        Collections.sort(employeeList);

//        filter employees based on the city "Noida" and then sort them in reverse alphabetical order by name

//        List<Employee> ans = employeeList.stream()
//                .filter(emp -> "Noida".equalsIgnoreCase(emp.getCity()))
//                .sorted(Comparator.comparing(Employee::getName).reversed())
//                .collect(Collectors.toList());



//        Find Top 3 Highest Paid Employees from a List
//        List<Employee> highestpaid = employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .limit(3)
//                .collect(Collectors.toList());
//
//        highestpaid.forEach(System.out::println);

//        Group Employees by Department
        Map<String, List<Employee>> empGrp = employeeList.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment()));


        //Sort Employees by Salary, Then by Name
//        List<Employee> employees = employeeList.stream()
//                .sorted(Comparator.comparing(Employee :: getSalary)
//                        .thenComparing(Employee :: getName))
//                .collect(Collectors.toList());


//      List<Employee> list = employeeList.stream().
//                     filter(emp -> emp.getCity().equalsIgnoreCase("Noida")).
//                      sorted(Comparator.comparing(emp -> emp.getName(), Comparator.reverseOrder()))
//              .collect(Collectors.toList());
//


//        Write a program to count a frequency of word from a given string s=" This is is name name"
//        and store them in map using java 8 stream api.
//         String s = "This is is name name";
//         Map<String,Long> mp = Arrays.stream(s.split("//s+"))
//                 .collect(Collectors.groupingBy(word -> word, Collectors.counting()));


//        count a frequency of word from a given string s=" This is is name name"


        String s = "This is is name name";

        // Convert string into a stream of words and count frequency
        Map<String, Long> wordCount = Arrays.stream(s.split("\\s+")) // Split by whitespace
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Print the word frequency map
        System.out.println(wordCount);


    }
}
