package ADT4HashTables;

import java.util.LinkedList;

/**
 * Created by carolchen on 12/11/2015.
 */
public class HashSetA<T> implements Set<T> {

    final static private int DEFAULT_SIZE = 2; // default size of the table
    Object[] table;
    int elements = 0; //number of the elements in the table

    public HashSetA() {
        table = new Object[DEFAULT_SIZE];
    }
    public HashSetA(HashSetA orin) {
        table = new Object[orin.table.length];
    }

    public HashSetA(int size) {
        table = new Object[size];
    }

    private int hash(T element) {
        return  Math.abs(element.hashCode() % table.length);
    }

    @Override
    public void add(T element) {
        int bkt = hash(element);
        if (table[bkt] == null) {
            table[bkt] = new LinkedList<>();
        }
        LinkedList<T> ll = (LinkedList<T>) table[bkt];
        if(!ll.contains(element)) {
            ll.add(element);
            elements++;
        }
    }

    @Override
    public void remove(T element) {
        int bkt = hash(element);
        LinkedList<T> ll = (LinkedList<T>) table[bkt];
        if(ll != null && ll.contains(element)) {
            ll.remove(element);
            elements--;
        }

    }

    @Override
    public boolean contains(T element) {
        int bkt = hash(element);
        if (table[bkt] == null) {
           return false;
        }else return ((LinkedList<T>)table[bkt]).contains(element);
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public String toString() {
        String rtn = "";
        for(int i = 0; i<table.length; i++) {
            if(table[i] != null) {
                LinkedList<T> ll = (LinkedList<T>) table[i];
                for(T e: ll) {
                    rtn += (rtn.equals("") ? "" : ", ") + e.toString();
                }
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        Set<String> set = new HashSetA<String>();
        set.add("Mary");
        set.add("Bob");
        set.remove("Mary");
        System.out.println(set.toString());
    }



}
