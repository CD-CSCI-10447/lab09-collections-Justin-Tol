package edu.desu.collections.partA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListBasicsTest {
    private ArrayListBasics basics;

    @BeforeEach
    public void setUp() {
        basics = new ArrayListBasics();
    }

    @Test
    public void testCreateArrayList() {
        assertTrue(basics.createArrayList().isEmpty());
    }

    @Test
    public void testPrintArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        String result = basics.printArrayList(list);

        assertEquals("1 2 3 4 5 ", result); // Note the trailing space as per the format in the previous description
    }

    @Test
    public void testAddElements() {
        ArrayList<Integer> list = basics.createArrayList();
        basics.addElements(list, 1, 2, 3, 4, 5);
        assertEquals(5, list.size());
    }

    @Test
    public void testAddElements2() {
        ArrayList<Integer> list = basics.createArrayList();
        basics.addElements(list, 1, 2, 3, 4, 5, 8);
        assertEquals(6, list.size());
    }

    @Test
    public void testRemoveElement() {
        ArrayList<Integer> list = basics.createArrayList();
        basics.addElements(list, 1, 2, 3, 4, 5);
        basics.removeElement(list, 2); // removing element at index 2 which is 3
        assertEquals(4, list.size());
        assertEquals(Integer.valueOf(4), list.get(2));
    }
}
