package com.aokolnychyi.pattern.behavioral.chain;

public class Dollar20Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    final int amountToDispense = currency.getAmount();
    if (amountToDispense >= 20) {
      int num = amountToDispense / 20;
      int remainder = amountToDispense % 20;
      System.out.println("Dispensing " + num + " 20$ note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(currency);
    }
  }

}