package com.khl.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 451. Sort Characters By Frequency
 *
 * Given a string s, sort it in decreasing order based on the frequency of the
 * characters. The frequency of a character is the number of times it appears
 * in the string.
 *
 * Return the sorted string. If there are multiple answers, return any of them.
 *
 * @author Kevin Lee
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> frequencies = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.computeIfAbsent(c, (ch) -> 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        frequencies.entrySet().stream()
                .sorted((a, b) -> -Integer.compare(a.getValue(), b.getValue()))
                .forEach((entry) -> {
                    char key = entry.getKey();

                    for (int i = 0; i < entry.getValue(); i++) {
                        sb.append(key);
                    }
                });

        return sb.toString();
    }

}
