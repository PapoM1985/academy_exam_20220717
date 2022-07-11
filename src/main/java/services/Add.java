package services;

import dataobjects.FashionCurrency;

public class Add {

  private FashionCurrency leftElement;
  private FashionCurrency rightElement;

  public Add(FashionCurrency leftElement, FashionCurrency rightElement) {
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

    int pencesTotal = lPence + rPence;
    int shillingsTotal = lShillings + rShillings;
    int poundsTotal = lPound + rPound;

    OperationsService manageOp = new OperationsService();

    return manageOp.extractValue(pencesTotal, shillingsTotal, poundsTotal);

  }
}
