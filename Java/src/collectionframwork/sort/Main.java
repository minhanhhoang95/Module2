package collectionframwork.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Kien",29,"HT");
        Student student2 = new Student("Nam",20,"HT");
        Student student3 = new Student("Anh",27,"HT");
        Student student4 = new Student("Trung",28,"HT");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for (Student st : lists){
            System.out.println(st.toString());
        }
        AgeComparetor ageComparetor = new AgeComparetor();
        Collections.sort(lists,ageComparetor);
        System.out.println("so sánh theo tuổi : ");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
