package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieItem {
    private int idMovie;
    private int movie;
    private String movieName;
    private int moviePrice;
    private int count;

}
