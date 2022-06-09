package collectionframwork.hashmap_hashset;

public class Student {
    private String Name;
    private int Age;
    private String Address;

    public Student() {

    }

    public Student(String name, int age, String adress) {
        this.Name = name;
        this.Age = age;
        this.Address = adress;
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

    public String getAdress() {
        return Address;
    }

    public void setAdress(String adress) {
        Address = adress;
    }

    @Override
    public String toString() {
        return "Student name=" + Name + ",age=" + Age + ",address=" + Address;
    }
}
