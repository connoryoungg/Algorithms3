class DLList {
    private DLNode head;

    public DLList() {
        this.head = null;
    }

    public void listAdd(Book p) {
        DLNode newNode = new DLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            DLNode current = head;
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
            DLNode current = head;
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

    public String toString() {
        String output = "";
        DLNode current = head;
        while (current != null) {
            output += "\n" + current.data.title + "\n" + current.data.author + "\n" + current.data.price;
            current = current.next;
        }
        return output;
    }
}

