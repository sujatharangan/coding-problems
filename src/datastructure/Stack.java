package datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {

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
        String top = null;

        //Return last element
        if (!stack.isEmpty()) {
            top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
        }
        return top;
    }


    //Read last element without removing it from stack
    public String peek() {
        String top = null;

        //Return last element
        if (!stack.isEmpty()) {
            top = stack.get(stack.size()-1);
        }
        return top;
    }

}
