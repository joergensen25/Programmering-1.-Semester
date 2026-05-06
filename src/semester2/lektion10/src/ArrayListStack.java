package semester2.lektion10.src;

import java.util.ArrayList;

public class ArrayListStack implements StackI{

    ArrayList<Object> elements = new ArrayList<>();

    @Override
    public void push(Object element) {
        elements.addFirst(element);
    }

    @Override
    public Object pop() {
        return elements.getFirst();
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
