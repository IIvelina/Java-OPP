package StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = data.size() - 1;
        String item = data.get(lastIndex);
        data.remove(lastIndex);
        return item;
    }

    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int lastIndex = data.size() - 1;
        return data.get(lastIndex);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
