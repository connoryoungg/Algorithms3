class DLListG<T> {
    private DLNodeG<T> head;

    public DLListG() {
        this.head = null;
    }

    public void listAdd(T data) {
        DLNodeG<T> newNode = new DLNodeG<>(data);
        if (head == null) {
            head = newNode;
        } else {
            DLNodeG<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void listRemove(int pos) {
        if (pos == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        } else {
            DLNodeG<T> current = head;
            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.prev = current;
                }
            }
        }
    }
}
