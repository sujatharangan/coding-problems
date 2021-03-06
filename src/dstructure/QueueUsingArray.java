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
    private int head;
    private int tail;


    public QueueUsingArray(int size) {
        queue =new String[size];
        this.size = size;
        head = -1;
        tail = -1;
    }

    public void enqueue(String s) throws Exception{
        if (tail != size -1){
            tail++;
            queue[tail] = s;
        }
        else {
            throw new Exception("Queue is full");
        }

    }

    public String dequeue() throws Exception{
        if (head != tail) {
            head ++;
            String element = queue[head];
            return element;
        } else {
            throw new Exception("Queue is empty");
        }
    }
}
