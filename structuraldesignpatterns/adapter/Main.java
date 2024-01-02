package structuraldesignpatterns.adapter;

/*
 * We are demonstrating use of Adapter pattern via following example
 * in which an audio player device can play mp3 files only and wants 
 * to use an advanced audio player capable of playing vlc and mp4 files.
 * 
 * 
 * Use the Adapter class when you want to use some existing class, but its 
 * interface isn’t compatible with the rest of your code.
 * 
 * Use the pattern when you want to reuse several existing subclasses that 
 * lack some common functionality that can’t be added to the superclass.
 */
public class Main {
  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    audioPlayer.play("mp3", "beyond the horizon.mp3");
    audioPlayer.play("mp4", "alone.mp4");
    audioPlayer.play("vlc", "far far away.vlc");
    audioPlayer.play("avi", "mind me.avi");
  }
}
