package services;

import dataobjects.FashionCurrency;
import exceptions.OperatorNotFound;
import utils.OperatorsEnum;

public class OperationsService {

  private FashionCurrency firstValue = new FashionCurrency();
  private FashionCurrency secondValue = new FashionCurrency();
  private int divOrMul;
  private OperatorsEnum operator;

  public OperationsService(FashionCurrency firstValue, FashionCurrency secondValue,
      OperatorsEnum operator, int divOrMul) {
    this.firstValue = firstValue;
    this.secondValue = secondValue;
    this.operator = operator;
    this.divOrMul = divOrMul;
  }

  public FashionCurrency runOperation() throws OperatorNotFound {
    FashionCurrency money = new FashionCurrency();
    switch (operator.toString()) {
      case "SUM":
        Add sum = new Add(firstValue,secondValue);
        return sum.calc();
      case "MINUS":
        Minus minus = new Minus(firstValue,secondValue);
        return minus.calc();
      case "DIVISION":
        Division division = new Division(firstValue,divOrMul);
        return division.calc();
      case "MULTIPLICATION":
        Multiplication multply = new Multiplication(firstValue,divOrMul);
        return multply.calc();
    }
    throw new OperatorNotFound("The mathematical operator could not be found");
  }


}
