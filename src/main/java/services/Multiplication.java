package services;

import dataobjects.FashionCurrency;

public class Multiplication {

  private FashionCurrency leftElement;
  private int multiply;

  public Multiplication(FashionCurrency leftElement, int multiply) {
    this.leftElement = leftElement;
    this.multiply = multiply;
  }

  public FashionCurrency Calc() {
    int lPence = leftElement.getPence();
    int lShillings = leftElement.getShillings();
    int lPound = leftElement.getPounds();

    // Convert all in pence
    lPence = lPence + lShillings * 12 + lPound * 20 * 12;

    int pencesTotal = lPence / multiply;

    FashionCurrency newMoney = new FashionCurrency();

    newMoney.extractValue(pencesTotal, 0, 0);

    return newMoney;

  }

}
