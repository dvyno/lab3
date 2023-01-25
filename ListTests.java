import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.*;

public class ListTests{
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>(Arrays.asList("be", "bean", "dc", "belt", "ab", "cd", "bear"));
        List<String> expectedOutput = new ArrayList<>(Arrays.asList("be", "bean", "belt", "bear"));
        MyStringChecker sc = new MyStringChecker();
        assertEquals(expectedOutput, ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge() {
        String[] inputArr1 = {"a", "c"};
        String[] inputArr2 = {"b", "e", "f", "h"};
        List<String> input1 = new ArrayList<>(Arrays.asList(inputArr1));
        List<String> input2 = new ArrayList<>(Arrays.asList(inputArr2));

        String[] expectedArr = {"a", "b", "c", "e", "f", "h"};
        List<String> expectedOutput = new ArrayList<>(Arrays.asList(expectedArr));

        assertEquals(expectedOutput, ListExamples.merge(input1, input2));
    }
}
