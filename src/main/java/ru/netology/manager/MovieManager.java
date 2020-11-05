package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];
    private int itemsToReturn = 10;

    public MovieManager (int itemsToReturn){
        this.itemsToReturn = itemsToReturn;
    }

    public void add(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] getAll() {
        int countMovies = items.length;
        if (countMovies > itemsToReturn) {
            MovieItem[] result = new MovieItem[10];
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



