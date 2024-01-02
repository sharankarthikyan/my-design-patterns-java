package structuraldesignpatterns.proxy;

/*
 * This is act as proxy class
 */
public class ProxyImage implements Image {
  private RealImage realImage;
  private String fileName;

  public ProxyImage(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    // Do Something in proxy layer
    if (realImage == null) {
      realImage = new RealImage(fileName);
    }
    realImage.display(); // Call the actual object
    // Do Somethings once the object call gets completed.
  }
}
