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
}
