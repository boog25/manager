package ru.netology.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Movie;

@NoArgsConstructor
@Data
public class PosterManager {
    private Movie[] movies = new Movie[0];
    private int defaultCount = 10;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public PosterManager(int count) {
        this.count = count;
    }

    public void addMovie(Movie movie) {
        int length = movies.length + 1;
        Movie[] pac = new Movie[length];
        System.arraycopy(movies, 0, pac, 0, movies.length);
        int lastIndex = pac.length - 1;
        pac[lastIndex] = movie;
        movies = pac;
    }

    public Movie[] getAll() {
        Movie[] result = new Movie[0];
        if (count == 0 && movies.length <= defaultCount) {
            result = new Movie[movies.length];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
        }
        if (count == 0 && movies.length >= defaultCount) {
            result = new Movie[10];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
        }
        if (count != 0) {
            result = new Movie[count];
            for (int i = 0; i < result.length; i++) {
                int index = movies.length - i - 1;
                result[i] = movies[index];
            }
        }
        return result;
    }
}