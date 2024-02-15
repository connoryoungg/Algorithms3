public class AListGeneric<T> {

    int size;
    int maxSize;

    T[] items;
    public AListGeneric(int ms) {
        size = 0;
        maxSize = ms;
        items = (T[]) new Object[maxSize];
    }

    public void listAdd(T p) {
        if (size == maxSize) {
            items = grow(items, maxSize);
        }
        items[size] = p;
        size += 1;
    }

    T[] grow(T[] arr, int ms) {
        T[] items1 = arr;
        T[] items2;
        items2 = (T[]) new Object[ms * 2];
        for (int i = 0; i < ms; i++) {
            items2[i] = items1[i];
        }
        return items2;

    }

    void listRemove(int pos) {
        if (size == 0) {
            System.out.println("The list is empty");
            return;
        }
        if (pos > size) {
            System.out.println("Invalid Index");
        }
        for (int i = pos; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
        size -= 1;
    }

}

