package ADT6Maps;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by carolchen on 12/11/2015.
 */
public class HashMapTest {
    @Test
    public void testAdd() {
        Map<String, Integer> map = new HashMap<>();
        map.add("Bob", 19);
        assertTrue(map.size() == 1);
        assertTrue(map.toString().equals("(Bob, 19)"));
        map.add("Mary", 21);
        assertTrue(map.size() == 2);
        assertTrue(map.toString().equals("(Bob, 19), (Mary, 21)") || map.toString().equals("(Mary, 21), (Bob, 19)"));
        map.add("Mary", 20);
        assertTrue(map.size() == 2);
        assertTrue(map.toString().equals("(Bob, 19), (Mary, 20)") || map.toString().equals("(Mary, 20), (Bob, 19)"));
    }

    @Test
    public void testRemove() {
        Map<String, Integer> map = new HashMap<>();
        map.add("Bob", 19);
        assertTrue(map.size() == 1);
        assertTrue(map.toString().equals("(Bob, 19)"));
        map.add("Mary", 21);
        assertTrue(map.size() == 2);
        assertTrue(map.toString().equals("(Bob, 19), (Mary, 21)") || map.toString().equals("(Mary, 21), (Bob, 19)"));
        map.add("Fred", 20);
        assertTrue(map.size() == 3);
        map.remove("Fred");
        assertTrue(map.size() == 2);
        assertTrue(map.toString().equals("(Bob, 19), (Mary, 21)") || map.toString().equals("(Mary, 21), (Bob, 19)"));
        map.remove("Mary");
        assertTrue(map.size() == 1);
        assertTrue(map.toString().equals("(Bob, 19)"));
        map.remove("Sue");
        assertTrue(map.size() == 1);
        assertTrue(map.toString().equals("(Bob, 19)"));
    }

    @Test
    public void testGet() {
        Map<String, Integer> map = new HashMap<>();
        map.add("Bob", 19);
        assertTrue(map.size() == 1);
        assertTrue(map.toString().equals("(Bob, 19)"));
        map.add("Mary", 21);
        assertTrue(map.size() == 2);
        assertTrue(map.toString().equals("(Bob, 19), (Mary, 21)") || map.toString().equals("(Mary, 21), (Bob, 19)"));
        map.add("Fred", 20);
        assertTrue(map.size() == 3);
        assertTrue(map.get("Bob") == 19);
        assertTrue(map.get("Mary") == 21);
        assertTrue(map.get("Fred") == 20);
        assertTrue(map.get("Sue") == null);
        map.remove("Fred");
        assertTrue(map.get("Fred") == null);
    }



}
