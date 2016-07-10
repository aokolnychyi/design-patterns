package com.aokolnychyi.pattern.behavioral.mediator;

// Concrete user
public class UserImpl extends User {

  public UserImpl(ChatMediator med, String name) {
    super(med, name);
  }

  @Override
  public void send(String message) {
    System.out.println(this.name + ": Sending Message = " + message);
    mediator.sendMessage(message, this);
  }

  @Override
  public void receive(String message) {
    System.out.println(this.name + ": Received Message: " + message);
  }

}