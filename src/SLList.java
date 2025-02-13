public class SLList {
    private SLNode head;

    public SLList() {
        head = null;
    }

    public void addy(Song s) {
        SLNode newNode = new SLNode(s);
        if (head == null) {
            head = newNode;
        } else {
            SLNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void removy(int position) {
        if (position == 0) {
            head = head.next;
            return;
        }

        SLNode temp = head;
        for (int i = 0; temp != null & i < position; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        String result = "";
        SLNode temp = head;
        while (temp != null) {
            result += temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }
}
