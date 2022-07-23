package com.hashmap.exam;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void 클래스가_존재한다() {
        HashMap map = new HashMap();
    }

    @Test
    void 제너릭이_가능하다() {
        HashMap<String, Integer> map = new HashMap<>();
    }

    @Test
    void put() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
    }
}
