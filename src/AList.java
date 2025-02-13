public class AList {
    private Song[] songs;
    private int size;
    private int maxSize = 3;

    public AList() {
        songs = new Song[maxSize];
        size = 0;
    }
}
