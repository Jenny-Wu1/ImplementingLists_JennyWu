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
}
