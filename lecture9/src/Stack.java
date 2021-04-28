import java.util.ArrayList;

public class Stack {
//    LIFO - Last In First Out
    private ArrayList<Object> items;
    private int capacity;

    public Stack( int capacity ){
        this.capacity = capacity;
        items = new ArrayList<>( capacity );
    }

    public void push(Object item) throws StackException {
        if( items.size() == capacity){
            throw new StackException("Stack is full!");
        }
        items.add(item);
    }

    public Object pop() throws StackException {
        if( items.size() == 0 ){
            throw new StackException("Stack is empty!");
        }
        return items.remove( items.size() - 1);
    }
}
