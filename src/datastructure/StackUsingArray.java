package datastructure;

public class StackUsingArray {

    private int size;
    private String[] stack;
    private int top;

    public StackUsingArray(int size) {
        stack = new String[size];
        top = 0;
    }

    public String pop() throws Exception {
        if(top != 0) {
            String element = stack[top];
            top --;
            return element;
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public String peek() throws Exception{
        if(top != 0) {
            return stack[top];
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public void push(String str) throws Exception{
        //while stack is not full, push element into stack
        if (top != size -1) {
            stack[top] = str;
            //Increment top
            top++;
        }
        else {
            throw new Exception("Stack is full.");
        }
    }

}
