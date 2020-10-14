public class Main {
  public static void main(String[] args) {
    
    TaxContext taxContext = new TaxContext();

    IncomeTax incomeTax1 = new RichTax();
    IncomeTax incomeTax2 = new MiddleClassTax();
    IncomeTax incomeTax3 = new WorkingPoorTax();

    taxContext.incomeTax = incomeTax1;
    double amountToBeCollected = taxContext.calculateTax(13434000);
    taxContext.setTotalIncomeTaxCalculated(amountToBeCollected);

    System.out.println("Amount to be collected: " + amountToBeCollected);
    
    taxContext.incomeTax = incomeTax2;
    double amountToBeCollected2 = taxContext.calculateTax(5000);
    taxContext.setTotalIncomeTaxCalculated(amountToBeCollected2);

    System.out.println("Amount to be collected: " + amountToBeCollected2);

    taxContext.incomeTax = incomeTax3;
    double amountToBeCollected3 = taxContext.calculateTax(1500);
    taxContext.setTotalIncomeTaxCalculated(amountToBeCollected3);

    System.out.println("Amount to be collected: " + amountToBeCollected3);


    System.out.println("Total amount to be collected: " + taxContext.getTotalIncomeTaxCalculated());




  }
}
