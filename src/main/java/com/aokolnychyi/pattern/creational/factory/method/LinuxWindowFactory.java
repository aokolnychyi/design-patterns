package com.aokolnychyi.pattern.creational.factory.method;

import com.aokolnychyi.pattern.creational.factory.LinuxWindow;
import com.aokolnychyi.pattern.creational.factory.Window;

public class LinuxWindowFactory extends AbstractWindowFactory {

  @Override
  public Window createWindow() {
    return new LinuxWindow();
  }
}
