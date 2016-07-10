package com.aokolnychyi.pattern.creational.factory.abstr;

import com.aokolnychyi.pattern.creational.factory.LinuxTable;
import com.aokolnychyi.pattern.creational.factory.LinuxWindow;
import com.aokolnychyi.pattern.creational.factory.Table;
import com.aokolnychyi.pattern.creational.factory.Window;

/**
 * Such concrete factories are usually implemented as singletons.
 */
public class LinuxWidgetFactory extends AbstractWidgetFactory {

  @Override
  public Table createTable() {
    return new LinuxTable();
  }

  @Override
  public Window createWindow() {
    return new LinuxWindow();
  }
}
