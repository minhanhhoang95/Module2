package collectionframwork.sort;

import java.util.Comparator;

public class AgeComparetor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int resut = o1.getAge() - o2.getAge();
        return resut > 0 ? 1 : (resut < 0 ? -1 : 0);
    }
}
