package com.aokolnychyi.pattern.structural.proxy;

public class ProxyPatternTest {

  public static void main(String[] args) {
    CommandExecutor executor = new CommandExecutorProxy("non_admin", "non_admin_pwd");
    try {
      executor.runCommand("ls -ltr");
      executor.runCommand("rm -rf abc.pdf");
    } catch (Exception e) {
      System.out.println("Exception Message::" + e.getMessage());
    }
  }

}
