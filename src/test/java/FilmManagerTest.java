import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    @Test
    public void testEmptyArray() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddedOne() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");


        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testAddedThree() {
        FilmManager manager = new FilmManager();

        manager.add("Movie I");
        manager.add("Movie II");
        manager.add("Movie III");


        String[] expected = {"Movie I", "Movie II", "Movie III" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testShouldFindLastFilm() {
        FilmManager manager = new FilmManager(2);

        manager.add("Вперёд");
        manager.add("Джентельмены");
        manager.add("Отель Белград");


        String[] expected = {"Отель Белград", "Джентельмены" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

}
}