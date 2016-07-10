package com.aokolnychyi.pattern.structural.proxy;

public interface CommandExecutor {

  void runCommand(String cmd) throws Exception;
}