package ru.netology.repository;

import ru.netology.domain.MovieItem;

public class AfishaRepository {
    private MovieItem[] items = new MovieItem[0];

    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }


    public MovieItem findById(int idMovie) {
        for (MovieItem item : items) {
        if (item.getIdMovie() == idMovie){
            return item;
        }
    }
        return null;
}

    public void removeById (int idMovie){
        int length = items.length - 1;
        MovieItem[] tmp = new MovieItem[length];
        int index = 0;
        for (MovieItem item : items) {
            if (item.getIdMovie() != idMovie) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void  removeAll (){
        items = new MovieItem[0];
    }
}
