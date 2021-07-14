package StackAndQueue;

import java.util.Arrays;

public class ExpandableStack {
    private int [] stack = new int[3];
    private int top = 0;
    public ExpandableStack(){

    }
    private boolean isStackFulled(){
        return top == stack.length;
    }
    private boolean isStackNotEmpty(){
        return top == 0;
    }
    public void remove(){
        if(isStackNotEmpty()){
            top --;
        }
    }
    public void insert(int num){
        if(isStackFulled()){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        stack[top] = num;
        top ++;
    }
    public void print(){
        for (int i = 0; i < top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
