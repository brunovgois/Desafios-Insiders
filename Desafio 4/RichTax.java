public class RichTax implements IncomeTax {

  @Override
  public double calculateTax(double income) {
    return income * 0.001;
  }
}