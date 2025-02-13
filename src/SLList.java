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
        for (int i = 0; temp != null & i < position - 1; i++) {
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

    public static void main(String[] args) {
        SLList songsList = new SLList();
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
