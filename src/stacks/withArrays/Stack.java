package stacks.withArrays;

public class Stack<T> {

    private T[] stack;
    private int count = 0;

    public Stack() {
        stack = (T[]) new Object[1];
    }

    // we just have to add the new item to the end of the array O(1)
    public void push(T newData) {

        // Arrays are not dynamic data structure !
        // we have to resize the underlying array if necessary
        // if there are too many items : we double the size of the array
        // if there are too few items : then we decrease (shrink) the array

        if (count == stack.length) {
            resize(2 * count);
        }

        stack[count++] = newData;
    }


    // returns and remove the last items we have inserted O(1)
    public T pop() {
        if (isEmpty()) {
            return null;
        }

        T item = stack[--count];
        // obsolete references
        stack[count] = null;


        // the stack is 25% decrease the size
        if (count > 0 && count == stack.length / 4) {
            resize(count / 2);
        }

        return item;
    }

    // O(1)
    public boolean isEmpty() {
        return count == 0;
    }

    // size method in O(1)
    public int size() {
        return count;
    }

    // this is the bottleneck of the application O(N)
    private void resize(int capacity) {

        T[] stackCopy = (T[]) new Object[capacity];

        for (int i = 0; i < count; ++i) {
            stackCopy[i] = stack[i];
        }

        // update the references
        stack = stackCopy;
    }

}
