import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FileTests {
    @Test
    public void testParentDirectory() {
        File parent = new File("some-files/");

        // Check method runs
        List<File> result = null;
        boolean exceptionThrown = false;
        try {
            result = FileExample.getFiles(parent);
        }
        catch (IOException e) {
            exceptionThrown = true;
        }
        assertFalse(exceptionThrown);

        // Check output
        List<File> expectedOutput = new ArrayList<>(Arrays.asList(
            new File("some-files/a.txt"),
            new File("some-files/more-files/b.txt"),
            new File("some-files/more-files/c.java"),
            new File("some-files/even-more-files/d.java"),
            new File("some-files/even-more-files/a.txt")
        ));
        assertTrue(expectedOutput.containsAll(result));
    }

    @Test
    public void tesSubdirectory1() {
        File parent = new File("some-files/more-files");

        // Check method runs
        List<File> result = null;
        boolean exceptionThrown = false;
        try {
            result = FileExample.getFiles(parent);
        }
        catch (IOException e) {
            exceptionThrown = true;
        }
        assertFalse(exceptionThrown);

        // Check output
        List<File> expectedOutput = new ArrayList<>(Arrays.asList(
            new File("some-files/more-files/b.txt"),
            new File("some-files/more-files/c.java")
        ));
        assertTrue(expectedOutput.containsAll(result));
    }

    @Test
    public void testSubdirectory2() {
        File parent = new File("some-files/even-more-files");

        // Check method runs
        List<File> result = null;
        boolean exceptionThrown = false;
        try {
            result = FileExample.getFiles(parent);
        }
        catch (IOException e) {
            exceptionThrown = true;
        }
        assertFalse(exceptionThrown);

        // Check output
        List<File> expectedOutput = new ArrayList<>(Arrays.asList(
            new File("some-files/even-more-files/d.java"),
            new File("some-files/even-more-files/a.txt")
        ));
        assertTrue(expectedOutput.containsAll(result));
    }

    @Test
    public void testFiles() {
        File[] files = {
            new File("some-files/a.txt"),
            new File("some-files/more-files/b.txt"),
            new File("some/files/more-files/c.java"),
            new File("some-files/even-more-files/d.java"),
            new File("some-files/even-more-files/a.txt")
        };
        // Check method runs
            for (File f : files) {
            List<File> result = null;
            boolean exceptionThrown = false;
            try {
                result = FileExample.getFiles(f);
            }
            catch (IOException e) {
                exceptionThrown = true;
            }
            assertFalse(exceptionThrown);

            // Check output
            List<File> expectedOutput = new ArrayList<>(Arrays.asList(f));
            assertTrue(expectedOutput.containsAll(result));
        }
    }
}
