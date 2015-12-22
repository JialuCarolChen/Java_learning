package ADT2;

import AbstractDataTypes1.List;

/**
 * Created by carolchen on 3/10/2015.
 */
public class LinkedListA<T> implements List<T> {

    int elements;
    Node first, last;

    class Node {
        T value;
        Node next;
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + value + ((next == null)? "" : " "+next.toString());
        }

    }


    @Override
    public void add(T value) {
        if(first == null) {//if the list is empty
           first = last = new Node(value, null);
        }else {
            //common case
            last.next = new Node(value, null);
            last = last.next;
        }
        elements++;
    }

    @Override
    public void remove(int index) {
        if(index>=elements ||index<0) {
            throw new IndexOutOfBoundsException();
        }

        if(index == 0) {//remove the first guy
           first = first.next;
           //if there is only one guy in the list
           if (first == null) {
               last = null;
           }
        }else {
            Node prev = getNode(first, index -1);//get the node before the next node
            prev.next = prev.next.next;
            //if the guy get removed is the last guy
            if(prev.next == last) {
                last = prev;
            }
        }

        elements--;
    }

    private Node getNode(Node start, int offset) {
        return (offset == 0)? start : getNode(start.next, offset-1);
    }

    @Override
    public T get(int index) {
        if(index>=elements ||index<0) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(first, index).value;
    }

    @Override
    public int size() {
        return elements;
    }

    private Node recursiveReversal(Node me) {
       if(me.next == null) {
           return me;
       } else {
           Node newLast = me.next;
           Node start = recursiveReversal(newLast);
           newLast.next = me;
           return start;
       }
    }

    @Override
    public void reverse() {
        if(first == null) return;
        last = first;
        first = recursiveReversal(first);
        last.next = null;
    }

    @Override
    public String toString() {
        return ((first == null) ? "": first.toString());
    }
}
