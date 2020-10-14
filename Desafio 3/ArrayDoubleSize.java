public class ArrayDoubleSize extends Array{

    public ArrayDoubleSize(Object[] array) {
		super(array);
    }
    
    @Override
    public void add(Object object) {
        if(this.array[this.size-1] != null) {
            Object[] aux = new Object[this.size * 2];
            System.arraycopy(this.array, 0, aux, 0, this.size);
            this.size = this.size *2;
            this.array = aux;
        }
        for(int i = 0; i < this.array.length; i++) {
            if(this.array[i] == null) {
                this.array[i] = object;
                break;
            }
        }
    }


}
