public class MiddleClassTax implements IncomeTax {

  @Override
  public double calculateTax(double income) {
    return income * 0.15;
  }
}