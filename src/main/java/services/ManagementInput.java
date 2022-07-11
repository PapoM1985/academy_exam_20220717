package services;

import dataobjects.FashionCurrency;

public class ManagementInput {

  private String input;

  public ManagementInput(String input) {
    this.input = input;
  }

  public void extractNumbers() {
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

  }

}
