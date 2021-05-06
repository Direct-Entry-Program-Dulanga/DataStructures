public class Stack {

    private int[] arrnumber;

    public void push(int n){

            int[] temp = new int[arrnumber.length+1];
            for (int i = 0; i < arrnumber.length; i++) {
                temp[i] = arrnumber[i];
            }
            temp[temp.length-1] = n;
            arrnumber = temp;

    }

    public void pop(){

    }

    public boolean empty(){
        return false;
    }

    public int peek(){
        return 0;
    }

    public void clear(){

    }

    public void print(){

    }

    public boolean contains(int n){
        return true;
    }
}
