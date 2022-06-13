package task.textfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DemoFile {
    public static void main(String[] args)  {
        //tạo file
        try {
            java.io.File file = new java.io.File("file.txt");
            if (file.createNewFile()){
                System.out.println("file : " + file.getName());
            }else {
                System.out.println("file đã tồn tại");
            }
        }catch (IOException e){
            System.out.println("xảy ra lỗi ");
            e.printStackTrace();
        }
        // thêm phần tử vào file
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("file 1 ");
            fileWriter.write(1);
            fileWriter.write("hoan thanh");
            fileWriter.close();
        }catch (IOException e ){
            System.out.println("xay ra loi");
            e.printStackTrace();
        }
        //đọc file
        try{
            File file =new File("file.txt");
            Scanner read = new Scanner(file);
            while (read.hasNext()){
                String data = read.nextLine();
                System.out.println(data);
            }
                read.close();
        }catch (IOException e){
            System.out.println("xay ra loi");
            e.printStackTrace();
        }
        //lấy thông tin file
        File file = new File("file.txt");
        if (file.exists()){
            System.out.println("file : "+ file.getName());
            System.out.println("   " + file.getAbsolutePath());
            System.out.println(" write "+ file.canWrite());
            System.out.println("read : "+ file.canRead());
            System.out.println(" size : "+ file.length());

        }else {
            System.out.println("ko có file này");
        }


    }


}
