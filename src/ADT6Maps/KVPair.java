package ADT6Maps;

/**
 * Created by carolchen on 12/11/2015.
 */
public class KVPair<K, V> {
    K key;
    V value;
    KVPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" +key+ ", " +value+ ")";
    }
}
