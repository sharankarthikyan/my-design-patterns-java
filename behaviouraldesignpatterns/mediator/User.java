package behaviouraldesignpatterns.mediator;

public class User {
  private String name;
  private ChatRoom chatRoom;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User(String name, ChatRoom chatRoom) {
    this.name = name;
    this.chatRoom = chatRoom;
  }

  public void sendMessage(String message) {
    chatRoom.showMessage(this, message);
  }
}
