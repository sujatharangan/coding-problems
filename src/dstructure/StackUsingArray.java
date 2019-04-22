package dstructure;

public class StackUsingArray {

    public static void main(String[] args) throws Exception {
        StackUsingArray s = new StackUsingArray(5);
        s.push("1");
        System.out.print(s.peek() + " ");

        s.push("2");
        System.out.print(s.peek() + " ");

        s.push("3");
        System.out.print(s.peek() + " ");

        s.push("4");
        System.out.print(s.peek() + " ");

        s.push("5");
        System.out.print(s.pop()+ " ");
        System.out.print(s.pop()+ " ");
        System.out.print(s.pop()+ " ");
        System.out.print(s.pop()+ " ");
        System.out.print(s.pop()+ " ");

    }

    private int size;
    private String[] stack;
    private int top;

    public StackUsingArray(int size) {
        stack = new String[size];
        top = -1;
        this.size = size;
    }

    public String pop() throws Exception {
        if(top != -1) {
            String element = stack[top];
            top --;
            return element;
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public String peek() throws Exception{
        if(top != -1) {
            return stack[top];
        } else {
            throw new Exception("Stack is empty.");
        }
    }

    public void push(String str) throws Exception{
        //while stack is not full, push element into stack
        if (top != size -1) {
            top++;
            stack[top] = str;
        }
        else {
            throw new Exception("Stack is full.");
        }
    }

}
