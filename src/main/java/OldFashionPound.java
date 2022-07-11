import services.ManagementInput;

public class OldFashionPound {

  public static void main(String[] args) {
  /*  Expression must follow one of this rule:
    Xp Ys Zd [+|-] Ap Bs Cd
    Xp Ys Zd [*|/] K
   */

    String input = args[0];
//    System.out.println(input);
    ManagementInput manageInput = new ManagementInput(input);
    manageInput.extractNumbersFromInput();


  }

}