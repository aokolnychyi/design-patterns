package com.aokolnychyi.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete mediator
public class ChatMediatorImpl implements ChatMediator {

  private List<User> users;

  public ChatMediatorImpl() {
    this.users = new ArrayList<>();
  }

  @Override
  public void addUser(User user) {
    this.users.add(user);
  }

  @Override
  public void sendMessage(String message, User destinationUser) {
    // message should not be received by the user sending it
    this.users.stream()
        .filter(user -> user != destinationUser)
        .forEach(user -> user.receive(message));
  }

}