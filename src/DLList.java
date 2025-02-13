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
}
