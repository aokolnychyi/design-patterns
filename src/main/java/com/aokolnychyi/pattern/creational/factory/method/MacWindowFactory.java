package com.aokolnychyi.pattern.creational.factory.method;

import com.aokolnychyi.pattern.creational.factory.MacWindow;
import com.aokolnychyi.pattern.creational.factory.Window;

public class MacWindowFactory extends AbstractWindowFactory {

  @Override
  public Window createWindow() {
    return new MacWindow();
  }
}
