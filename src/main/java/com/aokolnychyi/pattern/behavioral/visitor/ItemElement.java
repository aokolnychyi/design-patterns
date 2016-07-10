package com.aokolnychyi.pattern.behavioral.visitor;

public interface ItemElement {

  int accept(ShoppingCartVisitor visitor);
}