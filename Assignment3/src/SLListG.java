class SLListG<T> {
    private SLNodeG<T> head;

    public SLListG() {
        this.head = null;
    }

    public void listAdd(T data) {
        SLNodeG<T> newNode = new SLNodeG<>(data);
        if (head == null) {
            head = newNode;
        } else {
            SLNodeG<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void listRemove(int pos) {
        if (pos == 0) {
            if (head != null) {
                head = head.next;
            }
        } else {
            SLNodeG<T> current = head;
            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
    }
}
