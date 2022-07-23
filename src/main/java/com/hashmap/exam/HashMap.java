package com.hashmap.exam;

import java.util.ArrayList;
import java.util.List;

public class HashMap<K, V> {
    Object[] keys;
    Object[] values;
    int size;

    HashMap(){
        size = 0;
        keys = new Object[2];
        values = new Object[keys.length];
    }

    void put(K key, V value){
        int index = indexOfKey(key);
        if(index>=0){
            values[index] = value;
        }
        else {
            sizeUpIfFull();
            
            keys[size] = key;
            values[size] = value;
            size++;
        }
    }

    private void sizeUpIfFull() {
        if(isFull()){
            sizeUpArr();
        }
    }

    private boolean isFull() {
        return size == keys.length;
    }

    private void sizeUpArr() {
        keys = Util.arr.sizeUp(keys);
        values = Util.arr.sizeUp(values);
    }

    V get(K key){
        Object data = null;
        int index = indexOfKey(key);

        if(index>=0){
            data = values[index];
        }
        return (V)data;
    }

    private int indexOfKey(K key) {
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

    void remove(K key){
        int index = indexOfKey(key);

        if(index == -1){
            return;
        }

        Util.arr.moveLeft(keys, index + 1, size - 1);
        Util.arr.moveLeft(values, index + 1, size - 1);

        size--;
    }


    public List<K> keySet() {
        List<K> keySet = new ArrayList<>();

        for(int i=0;i<size;i++){
            keySet.add((K)keys[i]);
        }

        return keySet;
    }
}
