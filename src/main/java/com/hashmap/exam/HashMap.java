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
}
