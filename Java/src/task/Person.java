package task;

public class Person {
    public String name;
    private int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void display() {
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("height : " + this.height);
    }

    public static void main(String[] args) {
        Person person = new Person("Minh", 20, 1.65f);
        System.out.println(person.getAge());
        person.setAge(27);
        System.out.println(person.getAge());
        person.setAge(-5);
        System.out.println(person.getAge());
        person.display();
    }
}
