package AbstractDataTypes1;

/**
 * Created by carolchen on 28/09/2015.
 */
public class ArrayList<T> implements List<T> {
    private static final int INITIAL_SIZE = 2;//start with a small value for degugging
    private static final double GROWTH_FACTOR = 1.5;

    T[] values = (T[]) new Object[INITIAL_SIZE];
    int elements;

    @Override
    public void add(T value) {
        if(elements == values.length) {
            T[] tmp = (T[]) new Object[(int) (elements*GROWTH_FACTOR)];
            for(int i = 0; i< elements;i++ ) {
                tmp[i] = values[i];
            }
            values = tmp;
        }

        values[elements] = value;//or values[elements++]
        elements = elements + 1;

    }

    @Override
    public void remove(int index) {
        elements--;
        for(int i = index; i<elements;i++) {
            values[i] = values[i+1];
        }
    }

    @Override
    public T get(int index) {
        if (index >= elements || index < 0)
            throw new IndexOutOfBoundsException();

        return values[index];
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public void reverse() {
        for(int i = 0; i < elements/2; i++) {
            T tmp = values[i];
            values[i] = values[(elements-1)-i];
            values[(elements-1)-i] = tmp;
        }
    }

    @Override
    public String toString() {
        String rtn = "";
        for(int i = 0; i < elements; i++) {
          rtn +=  ((i != 0) ? " " : "") + values[i];
        }
        return rtn;
    }
}
