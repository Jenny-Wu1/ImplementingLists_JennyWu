import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class Testing {
    private AList aList;
    private SLList slList;
    private DLList dlList;
    private Song song1, song2, song3;

    @BeforeEach
    public void setUp() {
        aList = new AList();
        slList = new SLList();
        dlList = new DLList();

        song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        song2 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        song3 = new Song("CASANOVE POSSE", "ALI", 4.00);
    }

    @Test
    public void aLitAdd1() {
        aList.addy(song1);
        assertTrue(aList.toString().contains("Coral Crown"));
    }

    @Test
    public void aLitAdd2() {
        aList.addy(song1);
        assertTrue(aList.toString().contains("Coral Crown"));
        aList.addy(song2);
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void aLitAdd3() {
        aList.addy(song1);
        assertTrue(aList.toString().contains("Coral Crown"));
        aList.addy(song2);
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
        aList.addy(song3);
        assertTrue(aList.toString().contains("CASANOVE POSSE"));
    }

    @Test
    public void slLitAdd1() {
        slList.addy(song1);
        assertTrue(slList.toString().contains("Coral Crown"));
    }

    @Test
    public void slLitAdd2() {
        slList.addy(song1);
        assertTrue(slList.toString().contains("Coral Crown"));
        slList.addy(song2);
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void slLitAdd3() {
        slList.addy(song1);
        assertTrue(slList.toString().contains("Coral Crown"));
        slList.addy(song2);
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
        slList.addy(song3);
        assertTrue(slList.toString().contains("CASANOVE POSSE"));
    }

    @Test
    public void dlLitAdd1() {
        dlList.addy(song1);
        assertTrue(dlList.toString().contains("Coral Crown"));
    }

    @Test
    public void dlLitAdd2() {
        dlList.addy(song1);
        assertTrue(dlList.toString().contains("Coral Crown"));
        dlList.addy(song2);
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
    }

    @Test
    public void dlLitAdd3() {
        dlList.addy(song1);
        assertTrue(dlList.toString().contains("Coral Crown"));
        dlList.addy(song2);
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
        dlList.addy(song3);
        assertTrue(dlList.toString().contains("CASANOVE POSSE"));
    }

    @Test
    public void aListRemove0() {
        aList.addy(song1);
        aList.removy(0);
        assertFalse(aList.toString().contains("Coral Crown"));
    }

    @Test
    public void aListRemove1() {
        aList.addy(song1);
        aList.addy(song2);
        aList.removy(1);
        assertFalse(aList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(aList.toString().contains("Coral Crown"));
    }

    @Test
    public void aListRemove2() {
        aList.addy(song1);
        aList.addy(song2);
        aList.addy(song3);
        aList.removy(2);
        assertFalse(aList.toString().contains("CASANOVE POSSE"));
        assertTrue(aList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(aList.toString().contains("Coral Crown"));
    }

    @Test
    public void slListRemove0() {
        slList.addy(song1);
        slList.removy(0);
        assertFalse(slList.toString().contains("Coral Crown"));
    }

    @Test
    public void slListRemove1() {
        slList.addy(song1);
        slList.addy(song2);
        slList.removy(1);
        assertFalse(slList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(slList.toString().contains("Coral Crown"));
    }

    @Test
    public void slListRemove2() {
        slList.addy(song1);
        slList.addy(song2);
        slList.addy(song3);
        slList.removy(2);
        assertFalse(slList.toString().contains("CASANOVE POSSE"));
        assertTrue(slList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(slList.toString().contains("Coral Crown"));
    }

    @Test
    public void dlListRemove0() {
        dlList.addy(song1);
        dlList.removy(0);
        assertFalse(dlList.toString().contains("Coral Crown"));
    }

    @Test
    public void dlListRemove1() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.removy(1);
        assertFalse(dlList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(dlList.toString().contains("Coral Crown"));
    }

    @Test
    public void dlListRemove2() {
        dlList.addy(song1);
        dlList.addy(song2);
        dlList.addy(song3);
        dlList.removy(2);
        assertFalse(dlList.toString().contains("CASANOVE POSSE"));
        assertTrue(dlList.toString().contains("El Pibe De Mi Barrio"));
        assertTrue(dlList.toString().contains("Coral Crown"));
    }

    @Test
    public void aListEmpty() {
        assertTrue(aList.toString().contains("Empty List"));
    }

    @Test
    public void slListEmpty() {
        assertTrue(slList.toString().contains("Empty List"));
    }

    @Test
    public void dlListEmpty() {
        assertTrue(dlList.toString().contains("Empty List"));
    }
}
