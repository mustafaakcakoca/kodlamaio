package kodlamaio.core.logging;

public class emailLogger implements baseLogger{
    @Override
    public void log(String data) {
        System.out.println("Email Üzerine Loglandı" +data);
    }
}
