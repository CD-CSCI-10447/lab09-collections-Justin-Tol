package edu.desu.collections.partB;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapBasicsTest {

    private MapBasics mapBasics;
    private Map<String, String> testMap;

    @BeforeEach
    public void setUp() {
        mapBasics = new MapBasics();
        testMap = mapBasics.createMap();
    }

    @Test
    public void testInsertPair() {
        mapBasics.insertPair(testMap, "USA", "Washington D.C.");
        assertTrue(testMap.containsKey("USA"));
        assertEquals("Washington D.C.", testMap.get("USA"));
    }

    @Test
    public void testRemovePair() {
        testMap.put("USA", "Washington D.C.");
        mapBasics.removePair(testMap, "USA");
        assertFalse(testMap.containsKey("USA"));
    }

    @Test
    public void testGetValue() {
        testMap.put("USA", "Washington D.C.");
        String capital = mapBasics.getValue(testMap, "USA");
        assertEquals("Washington D.C.", capital);
    }

    @Test
    public void testShowAllPairs() {
        testMap.put("USA", "Washington D.C.");
        testMap.put("France", "Paris");
        String result = mapBasics.showAllPairs(testMap);
        assertTrue(result.contains("USA: Washington D.C."));
        assertTrue(result.contains("France: Paris"));
    }
}
