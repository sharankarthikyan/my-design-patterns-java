package behaviouraldesignpatterns.chainofresponsibility;

/*
 * Chain of Responsibility is a behavioral design pattern that lets 
 * you pass requests along a chain of handlers. Upon receiving a request, 
 * each handler decides either to process the request or to pass it to the 
 * next handler in the chain.
 * 
 * Use the Chain of Responsibility pattern when your program is expected 
 * to process different kinds of requests in various ways, but the exact 
 * types of requests and their sequences are unknown beforehand.
 * 
 * Use the pattern when it’s essential to execute several handlers in a 
 * particular order.
 * 
 * Use the CoR pattern when the set of handlers and their order are 
 * supposed to change at runtime.
 */
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
