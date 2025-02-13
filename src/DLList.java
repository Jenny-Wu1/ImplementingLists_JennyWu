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
        for (int i = 0; temp != null && i < position; i++) {
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

    public String toString() {
        if (head == null) {
            return "Empty List";
        }
        String result = "";
        DLNode temp = head;
        while (temp != null) {
            result += temp.data + "\n";
            temp = temp.next;
        }
        return result;
    }

    public static void main(String[] args) {
        DLList songsList = new DLList();
        System.out.println(songsList);
        System.out.println();

        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        Song song3 = new Song("CASANOVE POSSE", "ALI", 4.00);
        songsList.addy(song1);
        songsList.addy(song3);
        songsList.addy(song2);
        songsList.addy(song1);
        System.out.println(songsList);
        System.out.println();

        songsList.removy(1);
        System.out.println(songsList);
    }
}
