package dstructure;


public class CircularQueueUsingArray {

    public static void main(String[] args) throws Exception {
        CircularQueueUsingArray q = new CircularQueueUsingArray(5);

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

        q.enqueue("6");
        System.out.print(q.dequeue()+ " ");
    }

    private String[] queue;
    private int size;
    private int head;
    private int tail;
    private int totalElements = 0;


    public CircularQueueUsingArray(int size) {
        queue =new String[size];
        this.size = size;
        head = -1;
        tail = -1;
    }

    public void enqueue(String s) throws Exception{
        if (totalElements != size){

            //Set tail correctly
            if (tail != (size -1 )) {
                tail++;
            } else {
                tail = 0;
            }

            queue[tail] = s;
            totalElements++;
        }
        else {
            throw new Exception("Queue is full");
        }

    }

    public String dequeue() throws Exception{
        if (totalElements != 0) {

            //Set head correctly
            if (head != (size -1)) {
                head++;
            } else {
                head = 0;
            }
            String element = queue[head];
            totalElements--;
            return element;
        } else {
            throw new Exception("Queue is empty");
        }
    }
}
