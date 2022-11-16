package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;


class  MovieManagerTest {

    MoviePoster movie1 = new MoviePoster(1, "Трейлер", "Бладшот");
    MoviePoster movie2 = new MoviePoster(2, "Мульфильм", "Вперед");
    MoviePoster movie3 = new MoviePoster(3, "Комедия", "Отель Белград");
    MoviePoster movie4 = new MoviePoster(4, "Боевик", "Джентельмены");
    MoviePoster movie5 = new MoviePoster(5, "Фантастика", "Человек-неведимка");
    MoviePoster movie6 = new MoviePoster(6, "Мульфильм", "Тролли.Мировой тур");
    MoviePoster movie7 = new MoviePoster(7, "Комедия", "Конец Света");
    MoviePoster movie8 = new MoviePoster(8, "Драма", "Сердце Пармы");
    MoviePoster movie9 = new MoviePoster(9, "Мульфильм", "Тайна Коко");
    MoviePoster movie10 = new MoviePoster(10, "Фантастика", "Интерстеллар");


    @Test
    void shouldFindAll() {
        MovieManager manager = new MovieManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        MoviePoster[] actual = manager.findAll();
        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll1() {
        MovieManager manager = new MovieManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        MoviePoster[] actual = manager.findAll();
        MoviePoster[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll2() {
        MovieManager manager = new MovieManager();

        manager.add(movie1);


        MoviePoster[] actual = manager.findAll();
        MoviePoster[] expected = {movie1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindAll3() {
        MovieManager manager = new MovieManager();

        MoviePoster[] actual = manager.findAll();
        MoviePoster[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldGetAll() {
    }

    @Test
    void shouldFindLast() {
        MovieManager manager = new MovieManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);


        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast1() {
        MovieManager manager = new MovieManager();

        manager.add(movie5);

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie5};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast3() {
        MovieManager manager = new MovieManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);


        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast4() {
        MovieManager manager = new MovieManager();

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast5() {
        MovieManager manager = new MovieManager(5);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast6() {
        MovieManager manager = new MovieManager(10);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);


        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void shouldFindLast7() {
        MovieManager manager = new MovieManager(12);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);


        MoviePoster[] actual = manager.findLast();
        MoviePoster[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(actual, expected);
    }
}

