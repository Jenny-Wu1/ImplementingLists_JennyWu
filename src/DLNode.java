public class DLNode {
    Object data;
    DLNode previous;
    DLNode next;

    public DLNode (Object data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
