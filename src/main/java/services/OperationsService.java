package services;

import dataobjects.FashionCurrency;

public class OperationsService {

  FashionCurrency firstValue = new FashionCurrency();
  FashionCurrency secondValue = new FashionCurrency();

  public OperationsService(FashionCurrency firstValue, FashionCurrency secondValue){
    this.firstValue = firstValue;
    this.secondValue = secondValue;
  }



}
