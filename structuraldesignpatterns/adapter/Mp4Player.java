package structuraldesignpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

  @Override
  public void playvlc(String filename) {
    // Do nothing
  }

  @Override
  public void playmp4(String filename) {
    System.out.println("Playing MP4 file. Name: " + filename);
  }
}
