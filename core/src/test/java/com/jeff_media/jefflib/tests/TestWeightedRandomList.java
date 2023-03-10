package com.jeff_media.jefflib.tests;

import com.jeff_media.jefflib.Assertions2;
import com.jeff_media.jefflib.UnitTest;
import com.jeff_media.jefflib.data.WeightedRandomList;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWeightedRandomList extends UnitTest {

    private final int loops = 100_000;

    @Test
    public void testProbability() {
        WeightedRandomList<String> list = new WeightedRandomList<>();
        list.add(9, "a");
        list.add(90, "b");
        list.add(1, "c");
        Map<String, Integer> map = new HashMap<>();
        System.out.println(list);
        for(int i = 0; i < loops; i++) {
            String s = list.getRandomElement();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        Map<String,Double> results = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            int amount = entry.getValue();
            double percent = amount / (double) loops * 100.0;
            String percentStr = String.format("%.2f", percent);
            System.out.println(entry.getKey() + ": " + amount + "(" + percentStr + "%)");
            results.put(entry.getKey(), percent);
        }
        Assertions2.assertBetween(8.5,9.5, results.get("a"));
        Assertions2.assertBetween(89.5,90.5, results.get("b"));
        Assertions2.assertBetween(0.5,1.5, results.get("c"));
    }
}
