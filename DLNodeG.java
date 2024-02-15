class DLNodeG<T> {
    T data;
    DLNodeG<T> next;
    DLNodeG<T> prev;

    public DLNodeG(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
