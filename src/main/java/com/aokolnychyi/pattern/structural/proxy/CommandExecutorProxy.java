package com.aokolnychyi.pattern.structural.proxy;

// proxy
public class CommandExecutorProxy implements CommandExecutor {

  private boolean isAdmin;
  private CommandExecutor executor;

  public CommandExecutorProxy(final String user, final String pwd) {
    isAdmin = "admin".equals(user) && "admin".equals(pwd);
    executor = new CommandExecutorImpl();
  }

  @Override
  public void runCommand(String cmd) throws Exception {
    if (isAdmin) {
      executor.runCommand(cmd);
    } else {
      if (cmd.trim().startsWith("rm")) {
        throw new Exception("rm command is not allowed for non-admin users.");
      } else {
        executor.runCommand(cmd);
      }
    }
  }

}