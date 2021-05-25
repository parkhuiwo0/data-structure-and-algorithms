package linkedlist.doubleLinkedList;

public class DoublyLinkedList<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);

        // this is the first item in the linked list
        if (tail == null) {
            // both of the pointers are pointing to the new node

            tail = newNode;
            head = newNode;
        } else {
            // we have to insert the new items to the end of the list
            // we just have to manipulate the tail node and its references to O(1)
            newNode.setPreviousNode(tail);
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public void traverseForward() {

        Node<T> actualNode = head;

        while (actualNode != null) {
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

}
