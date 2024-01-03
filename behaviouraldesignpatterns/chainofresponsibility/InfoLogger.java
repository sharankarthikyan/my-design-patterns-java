package behaviouraldesignpatterns.chainofresponsibility;

public class InfoLogger extends AbstractLogger {

  public InfoLogger(int level) {
    this.level = level;
  }

  @Override
  public void write(String message) {
    System.out.println("Standard Info::Logger: " + message);
  }
}
