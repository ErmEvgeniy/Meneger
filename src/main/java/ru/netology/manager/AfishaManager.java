package ru.netology.manager;

import ru.netology.domain.MovieItem;
import ru.netology.repository.AfishaRepository;

public class AfishaManager {
    private AfishaRepository repository;
    private int itemsToReturn;

    public AfishaManager() {
        this.itemsToReturn = 10;
    }

    public AfishaManager(AfishaRepository repository, int itemsToReturn) {
        this.repository = repository;
        this.itemsToReturn = itemsToReturn;
    }

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
        this.itemsToReturn = 10;
    }
    public void add(MovieItem item) {
        repository.save(item);
    }

    public MovieItem[] getAll() {
        MovieItem[] items = repository.findAll();
        int countMovies = items.length;
        if (countMovies > itemsToReturn) {
            MovieItem[] result = new MovieItem[itemsToReturn];
            for (int i = 0; i < itemsToReturn; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        } else {
            MovieItem[] result = new MovieItem[countMovies];
            for (int i = 0; i < countMovies; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }
    }
}















