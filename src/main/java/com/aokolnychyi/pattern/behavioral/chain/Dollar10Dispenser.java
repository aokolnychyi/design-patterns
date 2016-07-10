package com.aokolnychyi.pattern.behavioral.chain;

public class Dollar10Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    final int amountToDispense = currency.getAmount();
    if (amountToDispense >= 10) {
      int num = amountToDispense / 10;
      int remainder = amountToDispense % 10;
      System.out.println("Dispensing " + num + " 10$ note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(currency);
    }
  }

}
