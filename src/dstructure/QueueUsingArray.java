package dstructure;


import java.util.ArrayList;

public class QueueUsingArray {

    public static void main(String[] args) throws Exception {
        QueueUsingArray q = new QueueUsingArray(5);
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

    private String[] queue;
    private int size;
    private int top = -1;

    public QueueUsingArray(int size) {
        queue =new String[size];
        this.size = size;
    }

    public void enqueue(String s) throws Exception{
        if (top != size -1){
            top++;
            queue[top] = s;
        }
        else {
            throw new Exception("Queue is full");
        }

    }

    public String dequeue() throws Exception{
        if (top != -1) {
            String element = queue[0];
            top--;
            return element;
        } else {
            throw new Exception("Queue is empty");
        }
    }
}
