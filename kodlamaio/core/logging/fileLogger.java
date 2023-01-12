package kodlamaio.core.logging;

public class fileLogger implements baseLogger{
    @Override
    public void log(String data) {
        System.out.println("Dosya üzerine Loglandı"+data);
    }
}
