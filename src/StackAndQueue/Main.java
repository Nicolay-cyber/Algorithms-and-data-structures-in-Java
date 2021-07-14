package StackAndQueue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        new RevertPhrase("Some phrase");
        System.out.println("----------------------");
        // 2. Создать класс для реализации дека.
        Deque deque = new Deque(10);
        deque.insertRight(1, 2, 3, 4);
        deque.print();
        deque.insertLeft(5, 6, 7, 8);
        deque.print();
        deque.insertLeft(9, 10, 11, 12);
        deque.print();
        deque.removeLeft();
        deque.print();
        deque.removeRight();
        deque.print();
        System.out.println("----------------------");
        // 3. Реализовать расширение массива в стеке при заполнении стека.
        ExpandableStack es = new ExpandableStack();
        es.insert(1);
        es.insert(2);
        es.insert(3);
        es.print();
        es.insert(4);
        es.insert(5);
        es.print();
        System.out.println("----------------------");
        // ***. Реализовать расширение массива в очереди при заполнении очереди.
        ExpandedDeque ed = new ExpandedDeque(3);
        ed.insertLeft(1);
        ed.print();
        ed.insertLeft(2);
        ed.print();
        ed.insertLeft(3);
        ed.print();
        System.out.println(Arrays.toString(ed.deque));
        ed.removeRight();
        ed.insertLeft(4);
        ed.insertRight(5);
        System.out.println(Arrays.toString(ed.deque));



    }
}
