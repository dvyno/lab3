import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    LinkedList emptyList, list;

    @Before
    public void setUp() {
        emptyList = new LinkedList();
        list = new LinkedList();
        Node head = new Node(9, null);
        head = new Node(6, head);
        head = new Node(3, head);
        list.root = head;
    }

    @Test
    public void testPrepend() {
        emptyList.prepend(3);
        emptyList.prepend(6);
        
        assertNotNull(emptyList.root);
        assertNotNull(emptyList.root.next);
        assertNull(emptyList.root.next.next);
        assertEquals(6, emptyList.root.value);

        assertEquals(3, emptyList.root.next.value);
    }

    @Test
    public void testAppend() {
        emptyList.append(3);
        emptyList.append(6);
        emptyList.append(9);

        assertNotNull(emptyList.root);
        assertNotNull(emptyList.root.next);
        assertNotNull(emptyList.root.next.next);
        assertNull(emptyList.root.next.next.next);

        assertEquals(3, emptyList.root.value);
        assertEquals(6, emptyList.root.next.value);
        assertEquals(9, emptyList.root.next.next.value);
    }

    @Test
    public void testFirst() {
        assertThrows(NullPointerException.class, () -> emptyList.first());
        assertEquals(3, list.first());
    }

    @Test
    public void testLast() {
        assertThrows(NullPointerException.class, () -> emptyList.first());
        assertEquals(9, list.last());
    }

    @Test
    public void testToString() {
        assertEquals("", emptyList.toString());
        assertEquals("3 6 9 ", list.toString());
    }

    @Test
    public void testLength() {
        assertEquals(0, emptyList.length());
        assertEquals(3, list.length());
    }
}
