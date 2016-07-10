package com.aokolnychyi.pattern.creational.factory.abstr;

import com.aokolnychyi.pattern.creational.factory.MacTable;
import com.aokolnychyi.pattern.creational.factory.MacWindow;
import com.aokolnychyi.pattern.creational.factory.Table;
import com.aokolnychyi.pattern.creational.factory.Window;

/**
 * Such concrete factories are usually implemented as singletons.
 */
public class MacWidgetFactory extends AbstractWidgetFactory {

  @Override
  public Table createTable() {
    return new MacTable();
  }

  @Override
  public Window createWindow() {
    return new MacWindow();
  }
}
