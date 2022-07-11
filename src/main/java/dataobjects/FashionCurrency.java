package dataobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class FashionCurrency {
  private int pounds;
  private int shillings;
  private int pence;

  public FashionCurrency() {
    this.pounds = 0;
    this.shillings = 0;
    this.pence = 0;
  }

  public void extractValue(int pence, int shillings, int pound) {
    int penceValue = pence % 12;
    int addShillings = pence / 12;
    int shillingsValue = (shillings + addShillings) % 20;
    int addPounds = (shillings + addShillings) / 20;
    int poundsValue = pound + addPounds;

    this.pence = penceValue;
    this.shillings = shillingsValue;
    this.pounds = poundsValue;

  }




}
