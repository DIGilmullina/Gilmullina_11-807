package primitives;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntArrayListTest {
    IntList list;


    @Before
    public void setUp() {
        list = new IntArrayList();
        list.add(41);
        list.add(74);
        list.add(6743);
        list.add(37);
    }


    @Test
    public void testSize(){
        int expected = 4;
        int actual = list.size();
        assertEquals(expected, actual);

    }

    @Test
    public void testContainsOn37(){
        assertTrue(list.contains(37));
    }

    @Test
    public void testToArray(){
        int[] expected = {41, 74, 6743, 37};
        int[] actual = list.toArray();
        assertArrayEquals(expected, actual);
    }

}
