package test;

import main.FixedArrays;
import org.junit.Test;

import static main.FixedArrays.getArrayLength;
import static main.FixedArrays.reverseArray;
import static main.FixedArrays.sum2DArrray;
import static main.FixedArrays.sumArray;
import static main.FixedArrays.sumTwoArrays;
import static org.junit.Assert.assertEquals;

public class FixedArraysTest {

  @Test
  public void testGetArrayLength() {
    assertEquals(3, getArrayLength(new int[] {1, 2, 3}));
  }

  @Test
  public void testSumArray() {
    assertEquals(6, sumArray(new int[] {1, 2, 3}));
    assertEquals(0, sumArray(new int[] {}));
    assertEquals(-1, sumArray(null));
  }

  @Test
  public void subtractSumOfEvenNumbersFromSumOfOddNumbers() {
    assertEquals(6, FixedArrays.subtractSumOfEvenNumbersFromSumOfOddNumbers(new int[] {1, 2, 3}));
    assertEquals(0, FixedArrays.subtractSumOfEvenNumbersFromSumOfOddNumbers(new int[] {}));
    assertEquals(-1, FixedArrays.subtractSumOfEvenNumbersFromSumOfOddNumbers(null));
  }

  @Test
  public void testSumTwoArrays() {
    assertEquals(new int[] {5, 7, 9}, sumTwoArrays(new int[] {1, 2, 3}, new int[] {4, 5, 6}));
  }

  @Test
  public void testReverseArray() {
    assertEquals(new int[] {3, 2, 1}, reverseArray(new int[] {1, 2, 3}));
    assertEquals(new int[] {}, reverseArray(new int[] {}));
  }

  @Test
  public void testSum2DArray() {
    int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

    assertEquals(45, sum2DArrray(mat));
  }
}
