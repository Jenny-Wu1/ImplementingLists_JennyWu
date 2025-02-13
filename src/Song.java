public class Song {
    String title;
    String artist;
    double length;

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    public String toString() {
        return "songName: " + title + ", artist: " + artist + ", length: " + length;
    }
}
