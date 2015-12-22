package ADT4HashTables;

import ADT2.*;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by carolchen on 12/11/2015.
 */
public class HashSet<T> implements Set<T> {

    final static private int DEFAULT_SIZE = 2; // default size of the table
    Object[] table;
    int elements = 0; //number of the elements in the table

    public HashSet() {
        table = new Object[DEFAULT_SIZE];
    }
    public HashSet(HashSet orin) {
        table = new Object[orin.table.length];
    }

    public HashSet(int size) {
        table = new Object[size];
    }

    private int hash(T element) {
        return Math.abs(element.hashCode()%table.length);
    }


    @Override
    public void add(T element) {
       int bkt = hash(element);
       if(table[bkt]==null) {
           table[bkt] = new LinkedList<T>();
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
        if(table[bkt]!=null) {
            LinkedList<T> ll = (LinkedList<T>) table[bkt];
            if(ll.contains(element)) {
                ll.remove(element);
                elements--;}
        }

    }

    @Override
    public boolean contains(T element) {
       int bkt = hash(element);
       LinkedList<T> ll = (LinkedList<T>) table[bkt];
       if(ll!=null&&ll.contains(element)) {
           return true;} else
           return false;
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public String toString() {
       String rtn = "";
       if(table==null) {return "";}
       for(int i = 0; i<table.length; i++) {

       }


    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Mary");
        set.add("Bob");
        set.remove("Mary");
        System.out.println(set.toString());
    }



}
