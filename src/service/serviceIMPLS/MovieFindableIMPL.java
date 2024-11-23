package service.serviceIMPLS;

import Enums.Genre;
import database.Database;
import models.Actor;
import models.Movie;
import service.MovieFindableService;

import java.time.LocalDate;
import java.util.LinkedList;

public class MovieFindableIMPL implements MovieFindableService {
    @Override
    public LinkedList<Movie> getAllmovies() {

        return Database.movies;
    }

    @Override
    public Movie findMovieByFullName(String name) {
        for (Movie movie: Database.movies){
            if(movie.getName().equalsIgnoreCase(name)){
                return movie;
            }
        }
        return null;
    }

    @Override
    public void findMovieByActorName(String actorName) {
        boolean check=true;
        for (Movie movie: Database.movies){
            for (Actor a: movie.getActors()){
                if(a.getName().equalsIgnoreCase(actorName)){
                    check=false;
                    System.out.println(movie);
                }
            }

            }
        if (check){
            System.out.println("No film");
        }
        }

    @Override
    public void findMovieByYear(int year) {
        boolean check=true;
        for (Movie movie:Database.movies){
            if (movie.getYear().getYear()==year){
                System.out.println(movie);
                check=false;
            }
        }
        if (check){
            System.out.println("No film");
        }

    }

    @Override
    public void findMovieByProducer(String producerFullName) {
        boolean check=true;
        for (Movie movie:Database.movies){
            if (movie.getProducer().getFirsName().equalsIgnoreCase(producerFullName)){
                System.out.println(movie);
                check=false;
            }
        }
        if (check){
            System.out.println("No film");
        }
    }

    @Override
    public void findMovieByGenre(Genre genre) {
        boolean check=true;
    for (Movie movie:Database.movies){
        if (movie.getGenre()==genre){
            System.out.println(movie);
            check=false;
        }
    }
        if (check){
            System.out.println("No film");
        }


    }

    @Override
    public void findMovieByRole(String role) {
        boolean check=true;
        for (Movie movie:Database.movies){
            for (Actor actor:movie.getActors()){
                if (actor.getRole().equalsIgnoreCase(role)) {
                    System.out.println(movie);
                    check=false;
                }
                }
            } if (check){
            System.out.println("No film");
        }
        }
    }




