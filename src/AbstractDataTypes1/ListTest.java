package AbstractDataTypes1;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by carolchen on 28/09/2015.
 */
public class ListTest {
    @Test
    public void testAdd() {
        List<String> l = new ArrayListA<>();
        assertTrue(l.size()==0);
        l.add("a");
        assertTrue(l.size() == 1);
        l.add("bb");
        assertTrue(l.size() == 2);
        l.add("ccc");
        assertTrue(l.size() == 3);
        assertTrue(l.toString().equals("a bb ccc"));
    }

    @Test
    public void testRemove() {
        List<String> l = new ArrayListA<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        assertTrue(l.toString().equals("a bb ccc"));
        l.remove(1);
        assertTrue(l.size() == 2);
        assertTrue(l.toString().equals("a ccc"));
        l.remove(0);
        assertTrue(l.size() == 1);
        l.remove(0);
        assertTrue(l.toString().equals(""));

    }

    @Test
    public void testGet() {
        List<String> l = new ArrayListA<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        assertTrue(l.get(0).equals("a"));
        assertTrue(l.get(1).equals("bb"));
        assertTrue(l.get(2).equals("ccc"));
    }

    @Test
    public void testReverse() {
        List<String> l = new ArrayListA<>();
        l.add("a");
        l.add("bb");
        l.add("ccc");
        l.reverse();
        assertTrue(l.toString().equals("ccc bb a"));
        assertTrue(l.get(0).equals("ccc"));
        l.reverse();
        assertTrue(l.toString().equals("a bb ccc"));
        l.remove(0);
        l.reverse();
        assertTrue(l.toString().equals("ccc bb"));
    }
}
