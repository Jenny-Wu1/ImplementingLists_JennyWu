public class DLList {
    private DLNode head;

    public DLList() {
        head = null;
    }

    public void addy(Song s) {
        DLNode newNode = new DLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            DLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous =temp;
        }
    }

    public void removy(int position) {
        DLNode temp = head;
        for (int i = 0; temp != null & i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp.previous != null) {
            temp.previous.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.previous = temp.previous;
        }
    }
}
