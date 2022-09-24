package hw567;

public class Run {
    public static void main(String[] args) {
//    BaseLogger [] loggers = new BaseLogger[] {new DBLogger(),new EmailLogger(),new FileLogger()};
//    for (BaseLogger log : loggers){
//        log.Log("Log Mesaji");
//    }
        CustomerManager customerManager = new CustomerManager( new FileLogger ());
        customerManager.add();


    }
}
