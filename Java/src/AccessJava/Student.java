package AccessJava;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //hàm khởi tạo để khởi tạo biến
    Student(int r ,String n){
        rollno=r;
        name=n;
    }
    // phương thức static để thay đổi giá trị của biến static
    static void change(){
        college="CODEGYM";
    }
    // phương thức hiển thị giá trị
    void display (){
        System.out.println(rollno + " " + name + " " + college);
    }

}
class TestStaticMethod{
    public static void main(String[] args) {
        Student.change();// gọi phương thức thay đổi
        // tạo đối tượng
             Student s1 = new Student(111,"Trí");
             Student s2 = new Student(222,"Minh");
             Student s3 = new Student(333,"Phong");
        // gọi phương thức hiển thị
        s1.display();
        s2.display();
        s3.display();
    }
}
