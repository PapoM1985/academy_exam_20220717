package dataobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FashionCurrency {
  private int pounds;
  private int shillings;
  private int pence;

  public FashionCurrency(int pounds, int shillings, int pence) {
    this.pounds = pounds;
    this.shillings = shillings;
    this.pence = pence;
  }




}
