package com.aokolnychyi.pattern.behavioral.mediator;

public class ChatClient {

  public static void main(String[] args) {
    ChatMediator mediator = new ChatMediatorImpl();
    User user1 = new UserImpl(mediator, "User 1");
    User user2 = new UserImpl(mediator, "User 2");
    User user3 = new UserImpl(mediator, "User 3");
    User user4 = new UserImpl(mediator, "User 4");
    mediator.addUser(user1);
    mediator.addUser(user2);
    mediator.addUser(user3);
    mediator.addUser(user4);

    user1.send("Hi All");
  }

}