package services;

import dataobjects.FashionCurrency;

public class Minus {

  private FashionCurrency leftElement;
  private FashionCurrency rightElement;

  public Minus(FashionCurrency leftElement, FashionCurrency rightElement) {
    this.leftElement = leftElement;
    this.rightElement = rightElement;
  }


  public FashionCurrency Calc(FashionCurrency leftElement, FashionCurrency rightElement) {
    int lPence = leftElement.getPence();
    int lShillings = leftElement.getShillings();
    int lPound = leftElement.getPounds();

    int rPence = rightElement.getPence();
    int rShillings = rightElement.getShillings();
    int rPound = rightElement.getPounds();

    // Convert all in pence
    lPence = lPence + lShillings * 12 + lPound * 20 * 12;
    rPence = rPence + rShillings * 12 + rPound * 20 * 12;

    int pencesTotal = lPence - rPence;

    FashionCurrency newMoney = new FashionCurrency();

    newMoney.extractValue(pencesTotal, 0, 0);

    return newMoney;

  }

}
