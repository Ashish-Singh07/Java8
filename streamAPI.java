package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Shubham", "Jain", 25, "Male", "CSE", "Bangalore", 84, Arrays.asList("123", "456")),
                new Student(2, "Ila", "Saxena", 28, "Female", "ECE", "Chennai", 42, Arrays.asList("789", "012")),
                new Student(3, "Ramesh", "Srivastava", 26, "Male", "CSE", "Hyderabad", 91, Arrays.asList("345", "678")),
                new Student(4, "Sonal", "Verma", 27, "Female", "ECE", "Mumbai", 13, Arrays.asList("901", "234")),
                new Student(5, "Suresh", "Singh", 25, "Male", "CSE", "Bangalore", 67, Arrays.asList("567", "890")),
                new Student(6, "Neha", "Jain", 28, "Female", "ECE", "Bangalore", 25, Arrays.asList("111", "222")),
                new Student(7, "Ramesh", "Singh", 26, "Male", "CSE", "Chennai", 58, Arrays.asList("333", "444")),
                new Student(8, "Sonal", "Jain", 27, "Female", "ECE", "Hyderabad", 76, Arrays.asList("555", "666")),
                new Student(9, "Suresh", "Sharma", 25, "Male", "CSE", "Mumbai", 31, Arrays.asList("777", "888")),
                new Student(10, "Neha", "Srivastava", 28, "Female", "ECE", "Bangalore", 99, Arrays.asList("999", "000"))
        ).collect(Collectors.toList());
        

        // Find the list of students whose ranks is between 50 and 100
        List<Student> filteredList = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() < 100).collect(Collectors.toList());
        // filteredList.forEach(System.out::println);

        
        // Find the list of students who stays in Bangalore and sort them by their names
        List<Student> bangaloreStudents = studentList.stream()
                .filter(student -> student.getCity().equals("Bangalore"))
                .sorted((s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName()))
                .collect(Collectors.toList());
        // bangaloreStudents.forEach(System.out::println);

        List<Student> bangaloreStudents2  = studentList.stream()
                .filter(student -> student.getCity().equalsIgnoreCase("Bangalore"))
                .sorted((Comparator.comparing(Student::getFirstName))).collect(Collectors.toList());
        // bangaloreStudents2.forEach(System.out::println);


        List<Student> bangaloreStudents3  = studentList.stream()
                .filter(student -> student.getCity().equalsIgnoreCase("Bangalore"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());
        // bangaloreStudents3.forEach(System.out::println);


        // Sort bangalore student in Descending order of their name
        List<Student> bangaloreStudentsDesc = studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Bangalore"))
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
        contactNums1.forEach(System.out::println);
        List<String> contactNums2 = studentList.stream().flatMap(student->student.getContacts().stream()).collect(Collectors.toList());
        contactNums2.forEach(System.out::println);


        // Details of student with rank 2
        // studentList.stream().filter(student -> student.getRank() == 2).forEach(System.out::println);
        studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).limit(1).forEach(System.out::println);
        studentList.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();



    }
}
