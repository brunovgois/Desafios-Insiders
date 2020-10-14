public class ArrayBlock extends Array {

  public ArrayBlock(Object[] array) {
    super(array);
  }

  @Override
  public void add(Object object) {
    if(this.array[this.size-1] != null) {
      System.out.println("Array is full!");
    } else {
      for(int i = 0; i < this.array.length; i++) {
        if(this.array[i] == null) {
          this.array[i] = object;
          break;
        }
      }
    }
  }
  
}
