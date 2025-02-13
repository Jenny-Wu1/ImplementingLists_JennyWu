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
}
