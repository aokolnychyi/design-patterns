package com.aokolnychyi.pattern.behavioral.memento;

public class FileWriterClient {

  public static void main(String[] args) {

    FileWriterCaretaker caretaker = new FileWriterCaretaker();

    FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
    fileWriter.write("First Set of Data");
    System.out.println(fileWriter);
    System.out.println("---------------");
    // lets save the file
    caretaker.save(fileWriter);
    //now write something else
    fileWriter.write("\nSecond Set of Data");

    //checking file contents
    System.out.println(fileWriter);
    System.out.println("---------------");

    //lets undo to last save
    caretaker.undo(fileWriter);

    //checking file content again
    System.out.println(fileWriter);

  }

}
