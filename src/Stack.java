public class Stack {

    private int[] stack;

    public void push(int n){

        if(stack == null){
            stack = new int[1];
            stack[0] = n;
            System.out.println("push"+stack[0]);
        }else{
            int[] temp = new int[stack.length+1];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            temp[temp.length-1] = n;
            stack = temp;
        }

    }

    public void pop(){
        if (stack == null) {
            System.out.println("Can't pop");
        } else if (stack.length == 1) {
            stack = null;
        } else {
            int[] temp = new int[stack.length - 1];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }

    }

    public boolean empty(){
        if (stack ==null){
            System.out.println("Stack is Empty");
            return true;
        }
        else{
            return false;
        }
    }

    public int peek(){
        return 0;
    }

    public void clear(){

    }

    public void print(){
        if(empty()){
            System.out.println("[]");
        }
        System.out.print("[");
        for (int i = stack.length - 1; i >= 0 ; i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.print("\b\b]");
    }

    public boolean contains(int n){
        return true;
    }
}
