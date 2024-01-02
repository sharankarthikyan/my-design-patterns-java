package structuraldesignpatterns.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

  @Override
  public void playvlc(String filename) {
    System.out.println("Playing VLC file. Name: " + filename);
  }

  @Override
  public void playmp4(String filename) {
    // Do nothing
  }
}
