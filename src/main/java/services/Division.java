package services;

import dataobjects.FashionCurrency;

public class Division implements IMathOperation {

  private FashionCurrency leftElement;
  private int divider;

  public Division(FashionCurrency leftElement, int divider) {
    this.leftElement = leftElement;
    this.divider = divider;
  }


  public FashionCurrency calc() {
    int lPence = leftElement.getPence();
    int lShillings = leftElement.getShillings();
    int lPound = leftElement.getPounds();

    // Convert all in pence
    lPence = lPence + lShillings * 12 + lPound * 20 * 12;

    int pencesTotal = lPence / divider;

    FashionCurrency newMoney = new FashionCurrency();

    newMoney.extractValue(pencesTotal, 0, 0);

    return newMoney;


  }

}
