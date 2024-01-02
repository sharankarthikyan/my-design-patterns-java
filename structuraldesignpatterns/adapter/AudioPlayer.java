package structuraldesignpatterns.adapter;

public class AudioPlayer implements MediaPlayer{
  MediaAdapter mediaAdapter;

  @Override
  public void play(String audioType, String filename) {
    // MP3 file has built in support. So we don't need to call adapter.
    if(audioType.equalsIgnoreCase("mp3")) {
      System.out.println("Playing MP3 file. Name: " + filename);
    } else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
      // This is implemented using adapter.
      mediaAdapter = new MediaAdapter(audioType);
      mediaAdapter.play(audioType, filename);
    } else {
      // This is for unsupported media.
      System.out.println("Invalid media. " + audioType + " format not supported.");
    }
  }
}
