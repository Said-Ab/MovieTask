package service;

import Enums.Genre;
import models.Movie;

import java.time.LocalDate;
import java.util.LinkedList;

public interface MovieFindableService {
    LinkedList<Movie>getAllmovies();
    Movie findMovieByFullName(String name);
    void findMovieByActorName(String actorName);
    void findMovieByYear(int year);

    void findMovieByProducer(String producerFullName);

    void findMovieByGenre(Genre genre);

    void findMovieByRole(String role);
}
