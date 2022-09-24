package hw567;

public class DBLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to DataBase :" +message);
    }
}
