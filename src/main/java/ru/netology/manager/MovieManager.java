package ru.netology.manager;

import ru.netology.domain.MoviePoster;

public class MovieManager {
    private MoviePoster[] movies = new MoviePoster[0];
    private int limit;

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public MovieManager() {
        this.limit = 10;
    }

    public void add(MoviePoster item) {
        int length = movies.length + 1;
        MoviePoster[] tmp = new MoviePoster[length];

        System.arraycopy(movies, 0, tmp, 0, movies.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public MoviePoster[] findAll() {

        return movies;
    }

    public MoviePoster[] findLast() {
        MoviePoster[] movies = findAll();
        MoviePoster[] result;
        if (limit < movies.length) {
            result = new MoviePoster[limit];
        } else {
            result = new MoviePoster[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}