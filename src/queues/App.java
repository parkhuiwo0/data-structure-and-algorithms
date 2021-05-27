package queues;

public class App {
    public static void main(String[] args) {

        Queue<Integer> myQueue = new Queue<>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);

        System.out.println(myQueue.size());


        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.dequeue());
        }

    }
}
