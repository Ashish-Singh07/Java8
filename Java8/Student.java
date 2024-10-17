package Java8;

import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String dept;
    private String city;
    private int rank;
    private List<String> contacts;

    public Student(int id, String firstName, String lastName, int age, String gender, String dept, String city,
            int rank, List<String> contacts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.city = city;
        this.rank = rank;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", gender=" + gender + ", dept=" + dept + ", city=" + city + ", rank=" + rank + ", contacts="
                + contacts + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, gender, dept, city, rank, contacts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                age == student.age &&
                Objects.equals(gender, student.gender) &&
                Objects.equals(dept, student.dept) &&
                Objects.equals(city, student.city) &&
                rank == student.rank &&
                Objects.equals(contacts, student.contacts);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

}
