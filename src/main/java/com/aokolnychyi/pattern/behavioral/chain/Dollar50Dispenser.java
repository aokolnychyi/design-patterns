package com.aokolnychyi.pattern.behavioral.chain;

public class Dollar50Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    this.chain = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    final int amountToDispense = currency.getAmount();
    if (amountToDispense >= 50) {
      int num = amountToDispense / 50;
      int remainder = amountToDispense % 50;
      System.out.println("Dispensing " + num + " 50$ note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(currency);
    }
  }

}