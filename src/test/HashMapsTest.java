package test;

import java.util.HashMap;
import java.util.List;
import org.junit.Test;

import static main.HashMaps.getMapFromNameToNumberOfOcurrences;
import static main.HashMaps.getNumberOfKeysInMap;
import static org.junit.Assert.assertEquals;

public class HashMapsTest {

  @Test
  public void testGetNumberOfKeysInMap() {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 4);
    map.put(3, 9);
    assertEquals(3, getNumberOfKeysInMap(map));
  }

  @Test
  public void testGetMapFromNameToNumberOfOcurrences() {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("jim", 2);
    map.put("bob", 1);
    map.put("steve", 1);
    assertEquals(map, getMapFromNameToNumberOfOcurrences(List.of("jim", "bob", "jim", "steve")));
  }
}
