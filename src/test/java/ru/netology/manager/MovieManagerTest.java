package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MovieManagerTest {

    MovieItem Blatsot = new MovieItem(1, 1, "блатшот", 500, 1);
    MovieItem Vpered = new MovieItem(2, 2, "вперед", 500, 2);
    MovieItem OtelBelgrad = new MovieItem(3, 3, "отель белград", 400, 1);
    MovieItem Gentlemen = new MovieItem(4, 4, "джентельмены", 300, 1);
    MovieItem Nevidimka = new MovieItem(5, 5, "невидимка", 300, 1);
    MovieItem Trolli = new MovieItem(6, 1, "тролли", 200, 1);
    MovieItem NomerOdin = new MovieItem(7, 2, "номер один", 700, 2);
    MovieItem Vedmak = new MovieItem(8, 3, "ведьмак", 400, 1);
    MovieItem Dovod = new MovieItem(9, 4, "довод", 100, 1);
    MovieItem Prometey = new MovieItem(10, 5, "прометей", 600, 1);
    MovieItem Pirates = new MovieItem(11, 3, "пираты", 200, 3);


    //    Добавляем фильмы и вызываем список фильмов проверяем метод getAll
    @Test
    void add_getAll() {
        MovieManager manager = new MovieManager();

//        Добавляем фильмы

        manager.add(Blatsot);
        manager.add(Vpered);
        manager.add(OtelBelgrad);
        manager.add(Gentlemen);
        manager.add(Nevidimka);
        manager.add(Trolli);
        manager.add(NomerOdin);
        manager.add(Vedmak);
        manager.add(Dovod);
        manager.add(Prometey);

//        Вызываем список фильмов проверяем метод getAll
        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{Prometey, Dovod, Vedmak, NomerOdin, Trolli, Nevidimka, Gentlemen, OtelBelgrad, Vpered, Blatsot};
        assertArrayEquals(actual, expected);

    }

    // вызвать конструктор без параментров и проверить возврат меньшего количества и большего количества -2 теста


    // Проверяем если фильмов больше 10 то по умолчанию выводятся 10
    @Test
    void moreGetAll() {
        MovieManager manager = new MovieManager(10);

        manager.add(Blatsot);
        manager.add(Vpered);
        manager.add(OtelBelgrad);
        manager.add(Gentlemen);
        manager.add(Nevidimka);
        manager.add(Trolli);
        manager.add(NomerOdin);
        manager.add(Vedmak);
        manager.add(Dovod);
        manager.add(Prometey);


        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{Prometey, Dovod, Vedmak, NomerOdin, Trolli, Nevidimka, Gentlemen, OtelBelgrad, Vpered, Blatsot};
        assertArrayEquals(actual, expected);
    }

    //    Проверяем если фильмов в списке столько сколько мы сами запросили
    @Test
    void getAllCount() {
        MovieManager manager = new MovieManager(5);

        manager.add(Blatsot);
        manager.add(Vpered);
        manager.add(OtelBelgrad);
        manager.add(Gentlemen);
        manager.add(Nevidimka);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{Nevidimka, Gentlemen, OtelBelgrad, Vpered, Blatsot};
        assertArrayEquals(actual, expected);
    }

    //      Проверяем если фильмов в списке меньше чем запрошеннное количество
    @Test
    void moreGetAllCount() {
        MovieManager manager = new MovieManager(12);

        manager.add(Blatsot);
        manager.add(Vpered);
        manager.add(OtelBelgrad);
        manager.add(Gentlemen);
        manager.add(Nevidimka);
        manager.add(Trolli);
        manager.add(NomerOdin);
        manager.add(Vedmak);
        manager.add(Dovod);
        manager.add(Prometey);

        MovieItem[] actual = manager.getAll();
        MovieItem[] expected = new MovieItem[]{Prometey, Dovod, Vedmak, NomerOdin, Trolli, Nevidimka, Gentlemen, OtelBelgrad, Vpered, Blatsot};
        assertArrayEquals(actual, expected);
    }
}

