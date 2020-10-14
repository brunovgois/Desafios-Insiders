
public class TaxContext {
  private double totalIncomeTaxCalculated = 0;
  public IncomeTax incomeTax;

  public double getTotalIncomeTaxCalculated() {
    return totalIncomeTaxCalculated;
  }

  public void setTotalIncomeTaxCalculated(Double totalIncomeTaxCalculated) {
    this.totalIncomeTaxCalculated += totalIncomeTaxCalculated;
  }

  public IncomeTax getIncomeTax() {
    return incomeTax;
  }

  public void setIncomeTax(IncomeTax incomeTax) {
    this.incomeTax = incomeTax;
  }

  public double calculateTax(double income) {
    return incomeTax.calculateTax(income);
  }

  
}
