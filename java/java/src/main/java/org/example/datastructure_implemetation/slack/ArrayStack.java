package org.example.datastructure_implemetation.slack;

public class ArrayStack<T> {
    private Object[] stack;

    private int arraySize;
    private int top;

    public ArrayStack(int arraySize) {
        this.arraySize = arraySize;
        this.stack = new Object[arraySize];
        top = -1;

    }

    public void push(T value) {
        if(isFull()){
            System.out.println("stack is full");
        }
        stack[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("UnderFlow");
            return null;
        }

        return (T) stack[top--];
    }

    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == arraySize - 1;
    }

    public static void main(String args[]) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.push(9);
        stack.push(10);
        stack.pop();
        stack.show();

    }
}
