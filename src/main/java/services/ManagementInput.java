package services;

import dataobjects.FashionCurrency;
import exceptions.OperatorNotFound;
import utils.OperatorsEnum;

public class ManagementInput {

  private String input;
  private OperatorsEnum operator;

  public ManagementInput(String input) {
    this.input = input;
  }

  public FashionCurrency extractNumbersFromInput() {
    StringBuilder myInput = new StringBuilder(input);

    StringBuilder pound = new StringBuilder();
    StringBuilder shillings = new StringBuilder();
    StringBuilder pence = new StringBuilder();

    pound.append(myInput.substring(0, myInput.indexOf("p")));
    myInput.delete(0, myInput.indexOf("p") + 2);

    shillings.append(myInput.substring(0, myInput.indexOf("s")));
    myInput.delete(0, myInput.indexOf("s") + 2);

    pence.append(myInput.substring(0, myInput.indexOf("d")));
    myInput.delete(0, myInput.indexOf("d") + 2);

    FashionCurrency money = new FashionCurrency();
    money.setPounds(Integer.parseInt(String.valueOf(pound)));
    money.setShillings(Integer.parseInt(String.valueOf(shillings)));
    money.setPence(Integer.parseInt(String.valueOf(pence)));

    return money;
  }

  public OperatorsEnum findOperator() throws OperatorNotFound {
    String[] numbers = input.toString().split(" ");
    for (String number : numbers) {
      if (number.equals("+")) {
        return operator.SUM;
      } else if (number.equals("-")) {
        return operator.MINUS;
      } else if (number.equals("/")) {
        return operator.DIVISION;
      } else if (number.equals("*")) {
        return operator.MULTIPLICATION;
      }
    }
    throw new OperatorNotFound("The mathematical operator could not be found");
  }

}
