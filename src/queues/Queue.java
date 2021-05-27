package queues;

public class Queue<T extends Comparable<T>> {

    private Node<T> firstNode;
    private Node<T> lastNode;
    private int count = 0;

    public boolean isEmpty() {
        return this.firstNode == null;
    }

    public int size() {
        return this.count;
    }

    // O(1)
    public void enqueue(T data) {
        this.count++;

        Node<T> oldLastNode = lastNode;
        this.lastNode = new Node<>(data);
        this.lastNode.setNext(null);

        if (isEmpty()) {
            this.firstNode = this.lastNode;
        } else {
            oldLastNode.setNext(this.lastNode);
        }
    }

    // O(1)
    public T dequeue() {

        this.count--;

        T dataToDequeue = this.firstNode.getData();

        this.firstNode = this.firstNode.getNext();

        if (isEmpty()) {
            this.lastNode = null;
        }

        return dataToDequeue;
    }

}
