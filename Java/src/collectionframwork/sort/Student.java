package collectionframwork.sort;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String Name;
    private int Age;
    private String Address;

    public Student() {

    }

    public Student(String name, int age, String address) {
        this.Name = name;
        this.Age = age;
        this.Address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student name=" + Name + ",age=" + Age + ",address=" + Address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
