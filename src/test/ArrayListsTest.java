package test;

import java.util.List;
import main.ArrayLists;
import org.junit.Test;

import static main.ArrayLists.convertToFixedArrayOfPrimitiveInts;
import static main.ArrayLists.convertToListOfIntegers;
import static main.ArrayLists.convertToListOfStrings;
import static main.ArrayLists.sortArrayList;
import static org.junit.Assert.assertEquals;

public class ArrayListsTest {

  @Test
  public void testSortArrayList() {
    assertEquals(List.of(1, 2, 3), sortArrayList(List.of(3, 2, 1)));
  }

  @Test
  public void testConvertToListOfIntegers() {
    assertEquals(List.of(1,2,3), convertToListOfIntegers(List.of("1", "2", "3")));
  }

  @Test
  public void testConvertToListOfStrings() {
    assertEquals(List.of("1","2","3"), convertToListOfStrings(List.of(1, 2, 3)));
  }

  @Test
  public void testConvertToFixedArrayOfPrimitiveInts() {
    assertEquals(new int[]{1,2,3}, convertToFixedArrayOfPrimitiveInts(List.of("1", "2", "3")));
  }

}
