package service.serviceIMPLS;

import database.Database;
import models.Movie;

import service.MovieSortableService;

import java.util.Comparator;

public class MovieSortableIMPL implements MovieSortableService {
    @Override
    public void sortMovieByName() {
        Comparator<Movie>movieComparator=Comparator.comparing(Movie::getName);
        Database.movies.sort(movieComparator);
        for (Movie movie:Database.movies){
            System.out.println(movie);
        }
    }

    @Override
    public void sortByYear() {
        Comparator<Movie>movieComparator=Comparator.comparing(Movie::getYear);
        Database.movies.sort(movieComparator);
        for (Movie movie:Database.movies){
            System.out.println(movie);
        }

    }
    @Override
    public void sortByProducer() {
        Comparator<Movie> movieComparator = Comparator.comparing(movie -> movie.getProducer().getFirsName());
        Database.movies.sort(movieComparator);
        for (Movie movie : Database.movies) {
            System.out.println(movie);
        }
    }
}
