package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AfishaRepositoryTest {
    AfishaRepository repository = new AfishaRepository ();

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


    @Test
    void save() {
        //MovieItem manager = new MovieItem();

//        Добавляем фильмы

        repository.save(Blatsot);
        repository.save(Vpered);
        repository.save(OtelBelgrad);
        repository.save(Gentlemen);
        repository.save(Nevidimka);
        repository.save(Trolli);
        repository.save(NomerOdin);
        repository.save(Vedmak);
        repository.save(Dovod);
        repository.save(Prometey);

        MovieItem[] expected = new MovieItem[]{Blatsot, Vpered, OtelBelgrad, Gentlemen, Nevidimka,Trolli, NomerOdin,Vedmak, Dovod, Prometey};
        assertArrayEquals(repository.findAll(), expected);
    }

    @Test
    void findAll() {
        repository.save(Blatsot);
        repository.save(Vpered);
        repository.save(OtelBelgrad);
        repository.save(Gentlemen);
        repository.save(Nevidimka);
        repository.save(Trolli);
        repository.save(NomerOdin);
        repository.save(Vedmak);
        repository.save(Dovod);
        repository.save(Prometey);

        MovieItem[] actual = repository.findAll();
        MovieItem[] expected = new MovieItem[]{Blatsot, Vpered, OtelBelgrad, Gentlemen, Nevidimka,Trolli, NomerOdin,Vedmak, Dovod, Prometey};
        assertArrayEquals(actual, expected);
    }

    @Test
    void findById () {
        repository.save(Blatsot);
        repository.save(Vpered);
        repository.save(OtelBelgrad);
        repository.save(Gentlemen);
        repository.save(Nevidimka);
        repository.save(Trolli);
        repository.save(NomerOdin);
        repository.save(Vedmak);
        repository.save(Dovod);
        repository.save(Prometey);

        //находит фильм но не сравнивает с  expected
        MovieItem actual = repository.findById(5);
        MovieItem[] expected = new MovieItem[]{Nevidimka};
        assertArrayEquals(actual, expected);

    }
}