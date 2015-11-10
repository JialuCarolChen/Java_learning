package AbstractDataTypes1;

/**
 * Created by carolchen on 28/09/2015.
 */
public interface List<T> {
    public void add(T value);
    public void remove(int index);
    public T get(int index);
    public int size();
    public void reverse();
    public String toString();



}
