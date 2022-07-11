package services;

import dataobjects.FashionCurrency;

public class OperationsService {

  FashionCurrency importValue = new FashionCurrency();

  public FashionCurrency extractValue(int pence, int shillings, int pound) {
    int penceValue = pence % 12;
    int addShillings = pence / 12;
    int shillingsValue = (shillings + addShillings) % 20;
    int addPounds = (shillings + addShillings) / 20;
    int poundsValue = pound + addPounds;

    importValue.setPence(penceValue);
    importValue.setShillings(shillingsValue);
    importValue.setPounds(poundsValue);

    return importValue;
  }

}
