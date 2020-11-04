package ru.netology.manager;

import ru.netology.domain.MovieItem;

public class MovieManager {
    private MovieItem[] items = new MovieItem[0];

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
        if (countMovies > 10) {
            MovieItem[] result = new MovieItem[10];
            for (int i = 0; i < 10; i++) {
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

    public MovieItem[] getAll (int count){
        if(count <= items.length){
            MovieItem[] result = new MovieItem[count];
            for (int i = 0; i < count; i++) {
                int index = items.length - i - 1;
                result[i] = items[index];
            }
            return result;
        }else{
            return getAll();
        }
    }
}
