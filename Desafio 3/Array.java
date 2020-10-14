public abstract class Array {
    
    public Object[] array;
    public Integer size;

    public Array(Object[] array) {
        this.size = array.length;
        this.array = array;
    }

    public abstract void add(Object el);
    
    public void remove(int index){
     
        if(index < this.size) {
            array[index] = null;

            for(int i = index; i < this.size-1; i++){
                array[i] = array[i+1];
            }
            array[this.size-1] = null;
        }
    }
    
    public abstract void getElement(Object o);

    public Object getElementFromArray(int index) {
        return array[index];
    }

    public void printElements(){
        for(Object o : array){  
            System.out.println(o);
        }
    }

}
