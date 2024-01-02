package structuraldesignpatterns.adapter;

// Adapter pattern works as a bridge between two incompatible interfaces.
public class MediaAdapter implements MediaPlayer {
  AdvancedMediaPlayer advancedMediaPlayer;

  public MediaAdapter(String audioType) {
    if(audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer = new VlcPlayer();
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String filename) {
    if(audioType.equalsIgnoreCase("vlc")) {
      advancedMediaPlayer.playvlc(filename);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      advancedMediaPlayer.playmp4(filename);
    }
  }  
}
