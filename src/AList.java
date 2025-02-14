public class AList {
    private Object[] obs;
    private int size;
    private int maxSize = 3;

    public AList() {
        obs = new Object[maxSize];
        size = 0;
    }

    public void addy(Object o) {
        if (size == maxSize) {
            int newSize = maxSize * 2;
            Object[] newObs = new Object[newSize];
            for (int i = 0; i < size; i++) {
                newObs[i] = obs[i];
            }
            obs = newObs;
            maxSize = maxSize * 2;
        }
        obs[size] = o;
        size++;
    }

    public void removy(int position) {
        for (int i = position; i < size - 1; i++) {
            obs[i] = obs[i + 1];
        }
        obs[size - 1] = null;
        size--;
    }

    public String toString() {
        if (size == 0) {
            return "Empty List";
        }
        String result = "";
        for (int i = 0; i < size; i++) {
            result += obs[i] + "\n";
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
