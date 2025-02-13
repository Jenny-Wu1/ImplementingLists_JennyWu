public class AList {
    private Song[] songs;
    private int size;
    private int maxSize = 3;

    public AList() {
        songs = new Song[maxSize];
        size = 0;
    }

    public void addy(Song s) {
        if (size == maxSize) {
            int newSize = maxSize * 2;
            Song[] newSongs = new Song[newSize];
            for (int i = 0; i < size; i++) {
                newSongs[i] = songs[i];
            }
            songs = newSongs;
            maxSize = maxSize * 2;
        }
        songs[size] = s;
        size++;
    }

    public void removy(int position) {
        for (int i = position; i < size - 1; i++) {
            songs[i] = songs[i + 1];
        }
        songs[size - 1] = null;
        size--;
    }

    public String toString() {
        if (size == 0) {
            return "Empty List";
        }
        String result = "";
        for (int i = 0; i < size; i++) {
            result += songs[i] + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        AList songsList = new AList();
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
