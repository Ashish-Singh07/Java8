
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharterQuestions {
    public static void main(String[] args) {
     
        // 1. Write a lambda expression to sort a list of strings in reverse order
        List<String> planets = Arrays.asList("Mercury", "Venus", "Earth", "Mars");
        // planets.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        planets.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);

        // 2. Given a list of integers, return a list with only the even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

        // 3. Optional Class : Given an Optional<String>, write code to print its value if it is present otherwise print "Value not present"
        Optional<String> optional = Optional.of("Hello");
        optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value not present"));

        // 4. Method References: Convert a list of strings to uppercase using method references
        List<String> planets2 = Arrays.asList("Mercury", "Venus", "Earth", "Mars");
        planets2.stream().map(String::toUpperCase).forEach(System.out::println);

        // 5. Usage
        MyClass obj = new MyClass();
        obj.defaultMethod();


        // 6. Date and Time API: Get the current date and time and format it as yyyy-MM-dd HH:mm:ss
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);

        // 7. Stream Reduce Operation: Find the sum oof all the numbers in a list using the reduce method
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers2.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // 8. Usage: 
        List<String> strings = Arrays.asList("Mercury", "Venus", "Earth", "Mars");
        List<String> filteredStrings = filterStrings(strings, s -> s.startsWith("m"));
        filteredStrings.forEach(System.out::println);

        // 9. Grouping and Counting: Given a list of strings, group them by their length and count the number of string of each length
        List<String> strings2 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        Map<Integer, Long> groupedStrings = strings2.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(groupedStrings);

        // 10. Streams Collecting to a Map : Given a list of strings, create a map where the key is the string and the value is its length.
        List<String> strings3 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        Map<String, Integer> stringLengths = strings3.stream().collect(Collectors.toMap(String::toString, String::length));
        System.out.println(stringLengths);

        // 11. Stream Find First Element : Find the first string in a list that starts with the letter "b"
        List<String> strings4 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        Optional<String> firstString = strings4.stream().filter(s -> s.startsWith("b")).findFirst();
        firstString.ifPresent(System.out::println);

        // 12. Streams All Match: Check if all strings in a list have a length greater than 3
        List<String> strings6 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        boolean allMatch = strings6.stream().allMatch(s -> s.length() > 3);
        System.out.println(allMatch);

        // 13. Streams Any Match: Check if any string in a list starts with the letter "o"
        List<String> strings5 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        boolean anyMatch = strings5.stream().anyMatch(s -> s.startsWith("o"));
        System.out.println(anyMatch);

        // 14. Streams Map to Int: Convert a list of strings to a list of their lengths
        List<String> strings7 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<Integer> lengths = strings7.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);

        // 15. Streams FlatMap: Given a list of lists of integers, flatten it to a single list of integers
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));
        List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);

        // 16. Usage: 
        List<String> strings8 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<Person> persons = strings8.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);

        // 17. Streams Reduce for String Concatenation: Given a list of strings, concatenate them into a single string separated by commas
        List<String> strings9 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        String concatenatedString = strings9.stream().reduce("", String::concat);
        System.out.println(concatenatedString);

        // 18. Using Optional and Avoiding NullPointerExceptions: Safely get the length of a string if it is not null using Optional
        String str = "Hello";
        Optional <String> optionalStr = Optional.ofNullable(str);
        int length = optionalStr.map(String::length).orElse(0);
        System.out.println(length);

        //19. Date and Time API: Calculate Duration: Calculate the number of days between two dates.
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println(days);

        // 20. Stream Summarizing Int Statistics: Given a list of integers, get statistics like count, sum, min, max, and average
        List<Integer> numbersToSummarize = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbersToSummarize.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println(stats);

        // 21. Compare 2 strings arrays and remove duplicates using streams in Java 8
        List<String> strings10 = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> strings11 = Arrays.asList("Mercury", "Venus", "Earth", "Mars");
        List<String> uniqueStrings = Stream.concat(strings10.stream(), strings11.stream()).distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings);

        // 22. Given a list of integers, find out all the numbers starting with 1 using Stream functions
        List<Integer> numbers5 = Arrays.asList(1, 11, 101, 504, 60001, 45, 134, 1023, 10011);
        List<Integer> numbersStartingWithOne = numbers5.stream()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(numbersStartingWithOne);

        // 23. How to find duplicate elements in a given integers list in java using Stream functions
        List<Integer> numbers6 = Arrays.asList(1, 11, 101, 504, 60001, 45, 134, 1023, 10011, 1, 11, 6001, 45);
        List<Integer> duplicateNumbers = numbers6.stream()
                .filter(num -> Collections.frequency(numbers6, num) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicateNumbers);
        

        // 24. Concatenate 2 streams of List of Strings
        List<String> strings12 = Arrays.asList("Mercury", "Venus", "Earth", "Mars");
        List<String> strings13 = Arrays.asList("Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> concatenatedStrings = Stream.concat(strings12.stream(), strings13.stream()).collect(Collectors.toList());
        System.out.println(concatenatedStrings);

        // 25. Write code to transform a list of integers from sequential to parallel using Stream API
        List<Integer> numbers7 = Arrays.asList(1, 11, 101, 504, 60001, 45, 134, 1023, 10011);
        List<Integer> parallelNumbers = numbers7.stream().parallel().collect(Collectors.toList());
        System.out.println(parallelNumbers);

        



        

    }

    // 8. Predicate Interface: Write a method that takes a list of strings and a predicate and returns a list of strings that satisfy the predicate
        public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
            return strings.stream().filter(predicate).collect(Collectors.toList());
        }
}

// 5. Default Methods in Interface: Create an interface with a default method and demonstrate its usage
interface MyInterface {
    default void defaultMethod() {
        System.out.println("Default Method in MyInterface");
    }
}
class MyClass implements MyInterface {}


// 16. Method References Constructor Reference : Given a list of strings, create a list of Person objects using their names. Assume Person has a constructor Person(String name)
class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
