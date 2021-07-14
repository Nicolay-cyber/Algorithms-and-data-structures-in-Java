package StackAndQueue;
import java.util.Arrays;

public class ExpandedDeque extends Deque {
    public ExpandedDeque(int capacity) {
        super(capacity);

    }

    @Override
    protected boolean isArrFull() {
        int [] leftPart;
        int [] rightPart;
        if(elemCount == capacity){
            if(right > left){
                leftPart = Arrays.copyOfRange(deque, 0, left + 1);
                rightPart = Arrays.copyOfRange(deque, left + 1, deque.length);
                deque = new int[deque.length * 2];
                System.arraycopy(leftPart,0, deque, 0, leftPart.length);
                System.arraycopy(rightPart,0, deque, leftPart.length + deque.length / 2 , rightPart.length);
                System.out.println(Arrays.toString(deque));
                left += deque.length/2;
            }
            else{
                leftPart = Arrays.copyOfRange(deque,0, deque.length);
                deque = new int[deque.length * 2];
                System.arraycopy(leftPart,0,deque,0,leftPart.length);
                left = deque.length - 1;
                right = leftPart.length;
            }
            capacity *= 2;
        }
        return false;
    }

}
