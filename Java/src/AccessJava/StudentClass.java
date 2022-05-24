package AccessJava;

public class StudentClass {
    private String name;
    private String classes;

    StudentClass(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return  "name : " + name;
    }

    public String getClasses() {
        return "class : " + classes;
    }
    void display (){
        System.out.println(getName() +" , "+getClasses() );
    }

    public static void main(String[] args) {
        StudentClass student1 = new StudentClass("Trí","C03");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        student1.display();
        StudentClass student2 = new StudentClass("Minh","C03");
        System.out.println(student2.getName());
        System.out.println(student2.getClasses());
        student2.display();


    }
}
