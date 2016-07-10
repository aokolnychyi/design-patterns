package com.aokolnychyi.pattern.behavioral.command;

public interface FileSystemReceiver {

  void openFile();

  void writeFile();

  void closeFile();
}