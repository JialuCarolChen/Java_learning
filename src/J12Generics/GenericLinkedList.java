package J12Generics;

/**
 * Created by carolchen on 24/08/2015.
 */
public class GenericLinkedList<T> {
    T value;
    GenericLinkedList<T> next;

    GenericLinkedList(T v) {
        this.value = v;
        this.next = null; //unnecessary assignment
    }

    void add (T v) {
       if (next == null) next = new GenericLinkedList(v);
        else
           next.add(v);
    }
    @Override
    public String toString() {
        if (next == null)
            return value + "";
        else
            return value + ", " + next;
    }

    public static void main(String[] args) {
        GenericLinkedList<Integer> ilist = new GenericLinkedList(5);
        ilist.add(3);
        ilist.add(7);
        ilist.add(13);
        System.out.println("Here it is! "+ilist);

        GenericLinkedList<Double> dlist = new GenericLinkedList(5.0);
        dlist.add(3.2);
        dlist.add(7.3);
        dlist.add(13.2);
        System.out.println("Here it is! "+dlist);


    }



}
