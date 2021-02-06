package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieTest {

    MovieManager movieManager = new MovieManager();

    Movie item1 = new Movie(1, "Монгол", "История");
    Movie item2 = new Movie(2, "Отель Белград", "Фильм");
    Movie item3 = new Movie(3, "Один дома", "комедия");
    Movie item4 = new Movie(4, "Бладшот", "боевик");
    Movie item5 = new Movie(5, "Остров проклятых", "ужасы");
    Movie item6 = new Movie(6, "Простоквашино", "мультфильм");
    Movie item7 = new Movie(7, "Борад", "комедия");
    Movie item8 = new Movie(8, "Интерстеллер", "фантастика");
    Movie item9 = new Movie(9, "Доктор Кто", "сериал");
    Movie item10 = new Movie(10, "Фиксики", "мультфильм");
    Movie item11 = new Movie(11, "Фиксики2", "мультфильм");

    @BeforeEach
    void setup() {
        movieManager.add(item1);
        movieManager.add(item2);
        movieManager.add(item3);
        movieManager.add(item4);
        movieManager.add(item5);
        movieManager.add(item6);
        movieManager.add(item7);
        movieManager.add(item8);
        movieManager.add(item9);
    }

    @Test
    public void shouldAddMoviesEqualManagerLength() {
        movieManager.add(item10);
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{item10, item9, item8, item7, item6, item5, item4, item3, item2, item1};
        assertArrayEquals(expected, actual);
    }

    MovieManager manager1 = new MovieManager(5);

    @BeforeEach
    void setup1() {
        manager1.add(item1);
        manager1.add(item2);
        manager1.add(item3);
        manager1.add(item4);
        manager1.add(item5);
        manager1.add(item6);
        manager1.add(item7);
        manager1.add(item8);
        manager1.add(item9);

    }

    @Test
    public void shouldAddLastItems() {
        manager1.add(item10);
        Movie[] actual = manager1.getAllLastItems();
        Movie[] expected = new Movie[]{item10, item9, item8, item7, item6};
        assertArrayEquals(expected, actual);
    }

}
