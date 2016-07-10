package com.aokolnychyi.pattern.creational.factory.abstr;

import com.aokolnychyi.pattern.creational.factory.Table;
import com.aokolnychyi.pattern.creational.factory.Window;

/**
 * Can contain only one method with parameter that describes which object should be created.
 */
public abstract class AbstractWidgetFactory {

  public abstract Table createTable();

  public abstract Window createWindow();
}
