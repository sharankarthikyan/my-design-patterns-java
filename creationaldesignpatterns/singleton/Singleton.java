package creationaldesignpatterns.singleton;

public class Singleton {
  private static Singleton instance = null;

  private Singleton() {
  }

  public static Singleton getInstance() {
    // Double Checked Locking for multi threading environment
    // Single Checked 
    if (instance == null) {
      synchronized (Singleton.class) {
        // Double checked
        if (instance == null) {
          instance = new Singleton();
        }
      }
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Hello");
  }
}
