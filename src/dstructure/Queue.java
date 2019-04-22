package dstructure;


import java.util.ArrayList;

public class Queue {

    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        q.enqueue("5");

        System.out.print(q.dequeue()+ " ");
        System.out.print(q.dequeue()+ " ");
        System.out.print(q.dequeue()+ " ");
        System.out.print(q.dequeue()+ " ");
        System.out.print(q.dequeue()+ " ");
    }

    private ArrayList<String> queue = new ArrayList<String>();

    public void enqueue(String s) {
        queue.add(s);
    }

    public String dequeue() throws Exception{
        if (!queue.isEmpty()) {
            String element = queue.get(0);
            queue.remove(0);
            return element;
        } else {
            throw new Exception("Queue is empty");
        }
    }
}
