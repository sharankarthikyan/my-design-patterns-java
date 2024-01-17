package behaviouraldesignpatterns.mediator;

import java.util.Date;

// Chat room is act as mediator.
public class ChatRoom {
  public void showMessage(User user, String message){
     System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
  }
}