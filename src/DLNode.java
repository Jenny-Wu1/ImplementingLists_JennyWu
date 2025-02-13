public class DLNode {
    Song data;
    DLNode previous;
    DLNode next;

    public DLNode (Song data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }
}
