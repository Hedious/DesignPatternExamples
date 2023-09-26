package creationalpatterns.singleton;

public class LoggerSingleton {
    private volatile static LoggerSingleton loggerSingleton;

    private LoggerSingleton() {

    }

    public void writeLog(String message) {
        System.out.println("Logger " + message);
    }

    public static LoggerSingleton getLoggerInstance() {
        if (loggerSingleton == null) {
            synchronized (LoggerSingleton.class) {
                if (loggerSingleton == null) {
                    loggerSingleton = new LoggerSingleton();
                }
            }
        }
        return loggerSingleton;
    }
}
