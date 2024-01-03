package behaviouraldesignpatterns.chainofresponsibility;

public class Main {
  public static AbstractLogger getChainOfLoggers() {
    AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
    AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

    infoLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(errorLogger);

    return infoLogger;
  }

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO,
        "This is an information.");

    loggerChain.logMessage(AbstractLogger.DEBUG,
        "This is an debug level information.");

    loggerChain.logMessage(AbstractLogger.ERROR,
        "This is an error information.");
  }
}
