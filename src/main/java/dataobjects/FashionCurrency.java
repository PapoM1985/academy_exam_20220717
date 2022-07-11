package dataobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FashionCurrency {
  private int pounds;
  private int shillings;
  private int pence;

  public FashionCurrency() {
    this.pounds = 0;
    this.shillings = 0;
    this.pence = 0;
  }




}
