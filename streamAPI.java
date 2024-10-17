package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {

        public static void main(String[] args) {
                List<Student> studentList = Stream.of(
                                new Student(1, "Shubham", "Jain", 25, "Male", "CSE", "Bangalore", 84,
                                                Arrays.asList("123", "456")),
                                new Student(2, "Ila", "Saxena", 28, "Female", "ECE", "Chennai", 42,
                                                Arrays.asList("789", "012")),
                                new Student(3, "Ramesh", "Srivastava", 26, "Male", "CSE", "Hyderabad", 91,
                                                Arrays.asList("345", "678")),
                                new Student(4, "Sonal", "Verma", 27, "Female", "ECE", "Mumbai", 13,
                                                Arrays.asList("901", "234")),
                                new Student(5, "Suresh", "Singh", 25, "Male", "CSE", "Bangalore", 67,
                                                Arrays.asList("567", "890")),
                                new Student(6, "Neha", "Jain", 28, "Female", "ECE", "Bangalore", 25,
                                                Arrays.asList("111", "222")),
                                new Student(7, "Ramesh", "Singh", 26, "Male", "CSE", "Chennai", 58,
                                                Arrays.asList("333", "444")),
                                new Student(8, "Sonal", "Jain", 27, "Female", "ECE", "Hyderabad", 76,
                                                Arrays.asList("555", "666")),
                                new Student(9, "Suresh", "Sharma", 25, "Male", "CSE", "Mumbai", 31,
                                                Arrays.asList("777", "888")),
                                new Student(10, "Neha", "Srivastava", 28, "Female", "ECE", "Bangalore", 99,
                                                Arrays.asList("999", "000")))
                                .collect(Collectors.toList());
/*
                // Find the list of students whose ranks is between 50 and 100
                List<Student> filteredList = studentList.stream()
                                .filter(student -> student.getRank() > 50 && student.getRank() < 100)
                                .collect(Collectors.toList());
                // filteredList.forEach(System.out::println);

                // Find the list of students who stays in Bangalore and sort them by their names
                List<Student> bangaloreStudents = studentList.stream()
                                .filter(student -> student.getCity().equals("Bangalore"))
                                .sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                                .collect(Collectors.toList());
                // bangaloreStudents.forEach(System.out::println);

                List<Student> bangaloreStudents3 = studentList.stream()
                                .filter(student -> student.getCity().equalsIgnoreCase("Bangalore"))
                                .sorted(Comparator.comparing(Student::getFirstName))
                                .collect(Collectors.toList());
                // bangaloreStudents3.forEach(System.out::println);

                // Sort bangalore student in Descending order of their name
                List<Student> bangaloreStudentsDesc = studentList.stream()
                                .filter(student -> student.getCity().equalsIgnoreCase("Bangalore"))
                                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                                .collect(Collectors.toList());
                // bangaloreStudentsDesc.forEach(System.out::println);

                // Get all the available department names
                List<String> deptNames = studentList.stream().map(Student::getDept)
                                .distinct()
                                .collect(Collectors.toList());
                // deptNames.forEach(System.out::println);

                Set<String> deptNames2 = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
                // deptNames2.forEach(System.out::println);

                // Get the list of contact numbers of all the students
                Stream<String> contactNums1 = studentList.stream().map(Student::getContacts).flatMap(List::stream);
                // contactNums1.forEach(System.out::println);
                List<String> contactNums2 = studentList.stream().flatMap(student -> student.getContacts().stream())
                                .collect(Collectors.toList());
                // contactNums2.forEach(System.out::println);

                // Details of student with rank 2
                // studentList.stream().filter(student -> student.getRank() ==
                // 2).forEach(System.out::println);
                // studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).limit(1).forEach(System.out::println);
                studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();

                // Group students by department names
                Map<String, List<Student>> studentListByDept = studentList.stream()
                                .collect(Collectors.groupingBy(Student::getDept));
                // studentListByDept.forEach((key, value) -> System.out.println(key + " : " +
                // value));

                // Group students by department names and show the count of students present in
                // each dept
                Map<String, Long> studentListByDeptCount = studentList.stream()
                                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
                // studentListByDeptCount.forEach((key, value) -> System.out.println(key + " : "
                // + value));

                // 7. Find the department with maximum number of students
                Map<String, Long> studentListByDeptCountMax = studentList.stream()
                                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
                Map.Entry<String, Long> maxDept = studentListByDeptCountMax.entrySet().stream()
                                .max(Comparator.comparing(Map.Entry::getValue)).get();
                // System.out.println("Department with maximum number of students : " +
                // maxDept);

                // 8. Find the average age of male and female students
                Map<String, Double> studentListByGenderAge = studentList.stream().collect(
                                Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
                // System.out.println("Average age of male and female students : " +
                // studentListByGenderAge);

                // 9. Find the heighest rank in each department
                Map<String, Optional<Student>> studentListByDeptRank = studentList.stream()
                                .collect(Collectors.groupingBy(Student::getDept,
                                                Collectors.minBy(Comparator.comparingInt(Student::getRank))));
                // System.out.println("Heighest rank in each department : \n" +
                // studentListByDeptRank);

                // 10. Find the student with second rank
                Student studentRank2 = studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1)
                                .findFirst().get();
                System.out.println("Student with second rank : " + studentRank2);

                // Find student with 3rd rank
                Student studentRank3 = studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2)
                                .findFirst().get();
                System.out.println("Student with 3rd rank : " + studentRank3);
*/


                // 1. Find the list of students whose rank is between 50 and 100
                studentList.stream().filter(student -> student.getAge()>=50 && student.getAge()<=100).collect(Collectors.toList());

                // 2. Find the list of students who stays in Bangalore and sort them by their names
                studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Bangalore")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
                
                // 3. Sort the Bangalore Students in Descending order or their name
                studentList.stream().filter(student-> student.getCity().equalsIgnoreCase("Bangalore")).sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).collect(Collectors.toList());

                // 4. Get all available department names
                studentList.stream().map(student-> student.getDept()).distinct().collect(Collectors.toList());

                // 5. Get the list of contact numbers of all students
                studentList.stream().flatMap(student -> student.getContacts().stream()).collect(Collectors.toList());

                // 6. Group student by department names
                studentList.stream().collect(Collectors.groupingBy(Student::getDept));

                // 7. Group students by department names and show the count of students present in each dept
                studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));

                // 8. Find the department with maximum number of students
                studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();

                // 9. Find the average age of male and female students
                studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));


                // 10. Find the heighest rank in each dept
                studentList.stream().collect(Collectors.groupingBy(Student::getDept,Collectors.minBy(Comparator.comparingInt(Student::getRank))));


                // 11. Find the student with second rank
                studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(1).findFirst().get();

                // 12. Find the student with third rank
                studentList.stream().sorted(Comparator.comparingInt(Student::getRank)).skip(2).findFirst().get();


        }
}
