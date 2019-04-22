package dstructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    public static void main(String[] args) {
        Stack s = new Stack();
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

    //Unbounded stack implementation using Linked List;
    private List<String> stack = new ArrayList<String>();

    public void push(String element) {
        stack.add(element);
    }

    public boolean empty() {
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public int size() {
        if (empty()){
            return 0;
        } else {
            return stack.size();
        }
    }

    public String pop() {
        String element = null;

        //Return last element
        if (!stack.isEmpty()) {
            element = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        }
        return element;
    }


    //Read last element without removing it from stack
    public String peek() {
        String element = null;

        //Return last element
        if (!stack.isEmpty()) {
            element = stack.get(stack.size()-1);
        }
        return element;
    }

}
