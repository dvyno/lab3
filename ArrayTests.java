import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input = {3, 9, 10, 12, 6, 5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5, 6, 12, 10, 9, 3}, input);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input = {3, 9, 10, 12, 6};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{6, 12, 10, 9, 3}, input);
  }


  @Test
  public void testReversed2() {
    int[] input = {3, 9, 10, 12, 6, 5};

    assertArrayEquals(new int[]{5, 6, 12, 10, 9, 3}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReversed3() {
    int[] input = {3, 9, 10, 12, 6};
    assertArrayEquals(new int[]{6, 12, 10, 9, 3}, ArrayExamples.reversed(input));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {3, 9, 10, 12, 6, 5};
    assertEquals(8.4, ArrayExamples.averageWithoutLowest(input), 0.001);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input = {3, 3, 9, 10, 12, 6, 5};
    assertEquals(8.4, ArrayExamples.averageWithoutLowest(input), 0.001);
  }
}
