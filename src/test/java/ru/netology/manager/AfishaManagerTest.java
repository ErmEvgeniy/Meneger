package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.domain.MovieItem;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;

    @InjectMocks
    private AfishaManager manager;
    private MovieItem Blatsot = new MovieItem(1, 1, "блатшот", 500, 1);
    private MovieItem Vpered = new MovieItem(2, 2, "вперед", 500, 2);
    private MovieItem OtelBelgrad = new MovieItem(3, 3, "отель белград", 400, 1);
    private MovieItem Gentlemen = new MovieItem(4, 4, "джентельмены", 300, 1);
    private MovieItem Nevidimka = new MovieItem(5, 5, "невидимка", 300, 1);
    private MovieItem Trolli = new MovieItem(6, 1, "тролли", 200, 1);
    private MovieItem NomerOdin = new MovieItem(7, 2, "номер один", 700, 2);
    private MovieItem Vedmak = new MovieItem(8, 3, "ведьмак", 400, 1);
    private MovieItem Dovod = new MovieItem(9, 4, "довод", 100, 1);
    private MovieItem Prometey = new MovieItem(10, 5, "прометей", 600, 1);
    private MovieItem Pirates = new MovieItem(11, 3, "пираты", 200, 3);

    @BeforeEach
    public void setUp() {
        manager.add(Blatsot);
        manager.add(Vpered);
        manager.add(OtelBelgrad);
        manager.add(Gentlemen);
        manager.add(Nevidimka);
        manager.add(Trolli);

    }

    @Test
    public void addAndGetall() {

        MovieItem[] returned = new MovieItem[]{Vpered, OtelBelgrad};
        doReturn(returned).when(repository).findAll();

        MovieItem[] expected = new MovieItem[]{OtelBelgrad, Vpered};
        MovieItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }

    @Test
    public void addAndGetallWithLimit() {

        MovieItem[] returned = new MovieItem[]{Blatsot, Vpered, OtelBelgrad, Gentlemen, Nevidimka, Trolli, NomerOdin, Vedmak, Dovod, Prometey, Pirates};
        doReturn(returned).when(repository).findAll();

        MovieItem[] expected = new MovieItem[]{Pirates, Prometey, Dovod, Vedmak, NomerOdin, Trolli, Nevidimka, Gentlemen, OtelBelgrad, Vpered};
        MovieItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }
}





















