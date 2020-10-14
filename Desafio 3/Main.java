

public class Main {
    public static void main(String[] args) {

      ArrayDoubleSize ar1 = new ArrayDoubleSize(new Integer[2]);
      Array50 ar2 = new Array50(new Integer[2]);
      ArrayBlock ar3 = new ArrayBlock(new Integer[2]);

      ar1.add(1);
      ar1.add(2);
      ar1.add(3);
      ar1.printElements();

      System.out.println("----");

      
      ar2.add(1);
      ar2.add(2);
      ar2.add(3);
      ar2.printElements();

      System.out.println("----");

      ar3.add(1);
      ar3.add(2);
      ar3.add(3);
      ar3.printElements();

    }
}