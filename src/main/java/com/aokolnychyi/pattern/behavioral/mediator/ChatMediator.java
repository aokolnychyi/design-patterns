package com.aokolnychyi.pattern.behavioral.mediator;

// mediator interface
public interface ChatMediator {

  void sendMessage(String msg, User user);

  void addUser(User user);
}