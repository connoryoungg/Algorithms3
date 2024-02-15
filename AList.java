public class AList {
    int size;
    int maxSize;
    Book[] books;
    public AList(int ms) {
        size = 0;
        maxSize = ms;
        books = new Book[maxSize];
    }

    public void listAdd(Book p) {
        if (size == maxSize) {
            books = grow(books, maxSize);
        }
        books[size] = p;
        size += 1;
    }

    Book[] grow(Book[] arr, int ms) {
        Book[] books1 = arr;
        Book[] books2 = new Book[ms * 2];
        for (int i = 0; i < ms; i++) {
            books2[i] = books1[i];
        }
        return books2;

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
            books[i] = books[i + 1];
        }
        size -= 1;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += "\n" + books[i].title + "\n" + books[i].author + "\n" + books[i].price;
        }
        return output;
    }

}
