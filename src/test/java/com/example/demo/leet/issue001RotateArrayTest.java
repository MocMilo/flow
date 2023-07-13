package com.example.demo.leet;

import com.example.demo.leet.issue001.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    void shouldRotateTable() {

        // given
        int k = 4;
        int[] target = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {4, 5, 6, 7, 1, 2, 3};

        // when
        int[] actual = RotateArray.rotate(target, k);

        // then
        for (int i = 0; i < target.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    void shouldRotateTableKBiggerThenLength() {

        // given
        int k = 18;  // 14 + 4
        int[] target = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {4, 5, 6, 7, 1, 2, 3};

        // when
        int[] actual = RotateArray.rotate(target, k);

        // then
        for (int i = 0; i < target.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}