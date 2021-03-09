package Creational;
public class SingletonApp {
    public static void main(String[] args) {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();
    }
}
