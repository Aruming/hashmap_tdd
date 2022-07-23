package com.hashmap.exam;

public class HashMap<K, V> {
    Object[] keys;
    Object[] values;
    int size;

    HashMap(){
        size = 0;
        keys = new Object[100];
        values = new Object[100];
    }

    void put(Object key, Object value){
        keys[size] = key;
        values[size] = value;
        size++;
    }
}
