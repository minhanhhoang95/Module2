package task.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> arr = new ArrayList<>();
        Student student_1 = new Student(1,"Trí");
        Student student_2 = new Student(2,"Minh");
        arr.add(student_1);
        arr.add(student_2);
        for(Student student: arr){
            System.out.println(student);
        }

    }
}
