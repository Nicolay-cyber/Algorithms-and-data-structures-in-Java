package StackAndQueue;

public class Deque {
    protected int left = 0;
    protected int right = 1;
    protected int elemCount = 0;
    protected int capacity;

    protected int [] deque;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[this.capacity];

    }
    public void removeLeft() {
        if(!isArrEmpty()){
            if(left == deque.length - 1){
                left = -1;
            }
            left ++;
            elemCount --;
        }
    }
    public void removeRight() {
        if(!isArrEmpty()){
            if(right == 0){
                right = deque.length;
            }
            right --;
            elemCount --;
        }
    }

    public void print() {
        int localCount = 0;
        for(int i = left + 1; localCount != elemCount; i++){
            if(i == deque.length){
                i = 0;
            }
            System.out.print(deque[i] + " ");
            localCount ++;
        }
        System.out.println();
    }

    protected boolean isLeftFull(){
        return left == 0;
    }
    protected boolean isRightFull(){
        return right == deque.length - 1;
    }
    protected boolean isArrFull() {
        return elemCount == capacity;
    }
    protected boolean isArrEmpty() {
        return elemCount == 0;
    }


    public void insertLeft(int ... numbers) {
        for (int i: numbers){
            if(!isArrFull()){
                deque[left] = i;
                if (isLeftFull()) {
                    left = deque.length;
                }
                left --;
                elemCount++;

            }
        }
    }
    public void insertRight(int ... numbers) {
        for(int i: numbers){
            if(!isArrFull()){
                deque[right] = i;
                if (isRightFull()){
                    right = -1;
                }
                right ++;
                elemCount++;
            }
        }
    }
}
