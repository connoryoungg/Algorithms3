class DLNode {
    Book data;
    DLNode next;
    DLNode prev;

    public DLNode(Book data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
