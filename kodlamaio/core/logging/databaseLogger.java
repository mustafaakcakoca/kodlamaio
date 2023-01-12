package kodlamaio.core.logging;

public class databaseLogger implements baseLogger{
    @Override
    public void log(String data) {
        System.out.println("Database üzerine Loglandı" + data);
    }
}
