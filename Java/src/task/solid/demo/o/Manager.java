package task.solid.demo.o;

public class Manager {
    public  void working(Employee employee){

        if(employee instanceof Dev){
            Dev dev = new Dev();
//            dev->working();
            dev.working();
        }else if(employee instanceof Sales){
           Sales sales = new Sales();
            sales.working();
        }else if(employee instanceof Tester){
           Tester tester = new Tester();
            tester.working();
        }
    }
}
