class SLList {
    private SLNode head;

    public SLList() {
        this.head = null;
    }

    public void listAdd(Book p) {
        SLNode newNode = new SLNode(p);
        if (head == null) {
            head = newNode;
        } else {
            SLNode current = head;
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
            SLNode current = head;
            for (int i = 0; i < pos - 1 && current != null; i++) {
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    public String toString() {
        String output = "";
        SLNode current = head;
        while (current != null) {
            output += "\n" + current.data.title + "\n" + current.data.author + "\n" + current.data.price;
            current = current.next;
        }
        return output;
    }
}

