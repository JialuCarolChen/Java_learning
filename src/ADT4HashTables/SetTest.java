package ADT4HashTables;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by carolchen on 12/11/2015.
 */
public class SetTest {
    @Test
    public void testAdd() {
        Set<String> set = new HashSet<>();
        set.add("Bob");
        assertTrue(set.toString().equals("Bob"));
        assertTrue(set.size() == 1);
        set.add("Mary");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);
        /*testing Bob will stay the same*/
        set.add("Bob");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);

    }

    @Test
    public void testRemove() {
        Set<String> set = new HashSet<>();
        set.add("Bob");
        set.add("Mary");
        set.add("Fred");
        set.remove("Fred");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);
        /*remove name that doesn't exist, the set stay the same*/
        set.remove("Sue");
        assertTrue(set.toString().equals("Bob, Mary") || set.toString().equals("Mary, Bob"));
        assertTrue(set.size() == 2);
    }

    @Test
    public void testContains() {
        Set<String> set = new HashSet<>();
        set.add("Bob");
        set.add("Mary");
        set.add("Fred");
        assertTrue(set.contains("Fred") && set.contains("Mary") && set.contains("Bob"));
        assertFalse(set.contains("Sue"));
    }
}
