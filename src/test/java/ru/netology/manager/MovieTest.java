package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class MovieTest {
    PosterManager movieManager = new PosterManager();

    @Test
    void MoviesNoAdd() {
        movieManager.getAll();
        Movie[] expected = new Movie[0];
        Movie[] actual = movieManager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void addMovie() {
        Movie one = new Movie(1, "Монгол", "История");
        movieManager.addMovie(one);
        movieManager.getAll();
        Movie[] expected = new Movie[]{one};
        Movie[] actual = movieManager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void addThenMovie() {
        Movie one = new Movie(1, "Монгол", "История");
        Movie two = new Movie(2, "Отель Белград", "Фильм");
        Movie three = new Movie(3, "Один дома", "комедия");
        Movie four = new Movie(4, "Бладшот", "боевик");
        Movie five = new Movie(5, "Остров проклятых", "ужасы");
        Movie six = new Movie(6, "Простоквашено", "мультфильм");
        Movie seven = new Movie(7, "Борад", "комедия");
        Movie eight = new Movie(8, "Интерстеллер", "фантастика");
        Movie nine = new Movie(9, "Доктор Кто", "сериал");
        Movie then = new Movie(10, "Фиксики", "мультфильм");
        movieManager.addMovie(one);
        movieManager.addMovie(two);
        movieManager.addMovie(three);
        movieManager.addMovie(four);
        movieManager.addMovie(five);
        movieManager.addMovie(six);
        movieManager.addMovie(seven);
        movieManager.addMovie(eight);
        movieManager.addMovie(nine);
        movieManager.addMovie(then);
        movieManager.getAll();
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{then, nine, eight, seven, six, five, four, three, two, one};
        assertArrayEquals(expected, actual);
    }


    @Test
    void addMoreThenMovie() {
        Movie one = new Movie(1, "Монгол", "История");
        Movie two = new Movie(2, "Отель Белград", "Фильм");
        Movie three = new Movie(3, "Один дома", "комедия");
        Movie four = new Movie(4, "Бладшот", "боевик");
        Movie five = new Movie(5, "Остров проклятых", "ужасы");
        Movie six = new Movie(6, "Простоквашено", "мультфильм");
        Movie seven = new Movie(7, "Борад", "комедия");
        Movie eight = new Movie(8, "Интерстеллер", "фантастика");
        Movie nine = new Movie(9, "Доктор Кто", "сериал");
        Movie then = new Movie(10, "Фиксики", "мультфильм");
        Movie eleven = new Movie(11, "Фиксики2", "мультфильм");
        movieManager.addMovie(one);
        movieManager.addMovie(two);
        movieManager.addMovie(three);
        movieManager.addMovie(four);
        movieManager.addMovie(five);
        movieManager.addMovie(six);
        movieManager.addMovie(seven);
        movieManager.addMovie(eight);
        movieManager.addMovie(nine);
        movieManager.addMovie(then);
        movieManager.addMovie(eleven);
        movieManager.getAll();
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{eleven,then, nine, eight, seven, six, five, four, three, two};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldUseNoArgsConstructor() {
        movieManager.setCount(5);
        Movie one = new Movie(1, "Монгол", "История");
        Movie two = new Movie(2, "Отель Белград", "Фильм");
        Movie three = new Movie(3, "Один дома", "комедия");
        Movie four = new Movie(4, "Бладшот", "боевик");
        Movie five = new Movie(5, "Остров проклятых", "ужасы");
        Movie six = new Movie(6, "Простоквашено", "мультфильм");
        Movie seven = new Movie(7, "Борад", "комедия");
        Movie eight = new Movie(8, "Интерстеллер", "фантастика");
        Movie nine = new Movie(9, "Доктор Кто", "сериал");
        Movie then = new Movie(10, "Фиксики", "мультфильм");
        movieManager.addMovie(one);
        movieManager.addMovie(two);
        movieManager.addMovie(three);
        movieManager.addMovie(four);
        movieManager.addMovie(five);
        movieManager.addMovie(six);
        movieManager.addMovie(seven);
        movieManager.addMovie(eight);
        movieManager.addMovie(nine);
        movieManager.addMovie(then);
        movieManager.getAll();
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{then, nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }


    @Test
    void shouldGetFiveMovie() {
        PosterManager movieManager = new PosterManager(5);
        Movie one = new Movie(1, "Монгол", "История");
        Movie two = new Movie(2, "Отель Белград", "Фильм");
        Movie three = new Movie(3, "Один дома", "комедия");
        Movie four = new Movie(4, "Бладшот", "боевик");
        Movie five = new Movie(5, "Остров проклятых", "ужасы");
        Movie six = new Movie(6, "Простоквашено", "мультфильм");
        Movie seven = new Movie(7, "Борад", "комедия");
        Movie eight = new Movie(8, "Интерстеллер", "фантастика");
        Movie nine = new Movie(9, "Доктор Кто", "сериал");
        Movie then = new Movie(10, "Фиксики", "мультфильм");
        movieManager.addMovie(one);
        movieManager.addMovie(two);
        movieManager.addMovie(three);
        movieManager.addMovie(four);
        movieManager.addMovie(five);
        movieManager.addMovie(six);
        movieManager.addMovie(seven);
        movieManager.addMovie(eight);
        movieManager.addMovie(nine);
        movieManager.addMovie(then);
        movieManager.getAll();
        Movie[] actual = movieManager.getAll();
        Movie[] expected = new Movie[]{then,nine, eight, seven, six};
        assertArrayEquals(expected, actual);
    }
}
