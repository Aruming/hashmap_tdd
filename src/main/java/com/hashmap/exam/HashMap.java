package com.hashmap.exam;

import java.util.ArrayList;
import java.util.List;

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
        int index = indexOfKey(key);
        if(index>=0){
            values[index] = value;
        }
        else {
            keys[size] = key;
            values[size] = value;
            size++;
        }
    }

    V get(Object key){
        Object data = null;
        int index = indexOfKey(key);

        if(index>=0){
            data = values[index];
        }
        return (V)data;
    }

    private int indexOfKey(Object key) {
        for(int i=0;i<size;i++){
            if(keys[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    int size(){
        return size;
    }

    void remove(Object key){
        int index = indexOfKey(key);

        if(index>=0) {
            for (int i = index; i < size - 1; i++) {
                keys[i] = keys[i + 1];
                values[i] = values[i + 1];
            }
            size--;
        }
    }


    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();

        for(int i=0;i<size;i++){
            keySet.add((K)keys[i]);
        }

        return keySet;
    }
}
