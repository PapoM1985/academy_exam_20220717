package services;

import dataobjects.FashionCurrency;

public class Division {

  private FashionCurrency leftElement;
  private int divider;

  public Division(FashionCurrency leftElement, int divider) {
    this.leftElement = leftElement;
    this.divider = divider;
  }


  public FashionCurrency Calc(FashionCurrency leftElement, int divider) {
    int lPence = leftElement.getPence();
    int lShillings = leftElement.getShillings();
    int lPound = leftElement.getPounds();

    // Convert all in pence
    lPence = lPence + lShillings * 12 + lPound * 20 * 12;

    int pencesTotal = lPence / divider;

    OperationsService manageOp = new OperationsService();

    return manageOp.extractValue(pencesTotal, 0, 0);

  }

}
