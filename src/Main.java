import Enums.Genre;
import database.Database;
import models.Actor;
import models.Movie;
import models.Producer;
import service.MovieFindableService;
import service.MovieSortableService;
import service.serviceIMPLS.MovieFindableIMPL;
import service.serviceIMPLS.MovieSortableIMPL;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        try {


            MovieFindableService movieFindableService = new MovieFindableIMPL();
            MovieSortableService movieSortableService = new MovieSortableIMPL();
            LinkedList<Actor> actors = new LinkedList<>();
            actors.add(new Actor("Mett", "Makonahi"));
            actors.add(new Actor("jesica", "Chestain"));
            actors.add(new Actor("Ann", "Heteuey"));
            Movie movie = new Movie("Interstaller", LocalDate.of(2014, 7, 1), Genre.FANTASTIC, new Producer("Christopher", "Nolan"), actors);

            LinkedList<Actor> actors1 = new LinkedList<>();
            actors.add(new Actor("Leonardo", "DiCaprio"));
            actors.add(new Actor("Joseph", "Gordon-Levitt"));
            actors.add(new Actor("Elliot", "Page"));
            Movie movie1 = new Movie(
                    "Inception",
                    LocalDate.of(2010, 7, 16),
                    Genre.DRAMA,
                    new Producer("Hans", "Summer"),
                    actors1
            );
            Producer producer1 = new Producer("Christopher", "Nolan");
            Producer producer2 = new Producer("James", "Cameron");
            Producer producer3 = new Producer("Steven", "Spielberg");
            Producer producer4 = new Producer("Quentin", "Tarantino");
            Producer producer5 = new Producer("Martin", "Scorsese");
            Producer producer6 = new Producer("Ridley", "Scott");
            Producer producer7 = new Producer("Peter", "Jackson");
            Producer producer8 = new Producer("Francis Ford", "Coppola");


            LinkedList<Actor> actors9 = new LinkedList<>();
            actors1.add(new Actor("Leonardo", "DiCaprio"));
            actors1.add(new Actor("Joseph", "Gordon-Levitt"));

            LinkedList<Actor> actors2 = new LinkedList<>();
            actors2.add(new Actor("Sam", "Worthington"));
            actors2.add(new Actor("Zoe", "Saldana"));

            LinkedList<Actor> actors3 = new LinkedList<>();
            actors3.add(new Actor("Tom", "Hanks"));
            actors3.add(new Actor("Matt", "Damon"));

            LinkedList<Actor> actors4 = new LinkedList<>();
            actors4.add(new Actor("John", "Travolta"));
            actors4.add(new Actor("Uma", "Thurman"));

            LinkedList<Actor> actors5 = new LinkedList<>();
            actors5.add(new Actor("Robert", "De Niro"));
            actors5.add(new Actor("Joe", "Pesci"));

            LinkedList<Actor> actors6 = new LinkedList<>();
            actors6.add(new Actor("Russell", "Crowe"));
            actors6.add(new Actor("Joaquin", "Phoenix"));

            LinkedList<Actor> actors7 = new LinkedList<>();
            actors7.add(new Actor("Elijah", "Wood"));
            actors7.add(new Actor("Ian", "McKellen"));

            LinkedList<Actor> actors8 = new LinkedList<>();
            actors8.add(new Actor("Marlon", "Brando"));
            actors8.add(new Actor("Al", "Pacino"));


            Movie movie9 = new Movie("Inception", LocalDate.of(2010, 7, 16), Genre.SCIENCE_FICTION, producer1, actors9);
            Movie movie2 = new Movie("Avatar", LocalDate.of(2009, 12, 18), Genre.SCIENCE_FICTION, producer2, actors2);
            Movie movie3 = new Movie("Saving Private Ryan", LocalDate.of(1998, 7, 24), Genre.DRAMA, producer3, actors3);
            Movie movie4 = new Movie("Pulp Fiction", LocalDate.of(1994, 10, 14), Genre.CRIME, producer4, actors4);
            Movie movie5 = new Movie("Goodfellas", LocalDate.of(1990, 9, 19), Genre.CRIME, producer5, actors5);
            Movie movie6 = new Movie("Gladiator", LocalDate.of(2000, 5, 5), Genre.ACTION, producer6, actors6);
            Movie movie7 = new Movie("The Lord of the Rings: The Fellowship of the Ring", LocalDate.of(2001, 12, 19), Genre.FANTASTIC, producer7, actors7);
            Movie movie8 = new Movie("The Godfather", LocalDate.of(1972, 3, 24), Genre.CRIME, producer8, actors8);
            Database.movies.add(movie);
            Database.movies.add(movie1);
            Database.movies.add(movie9);
            Database.movies.add(movie2);
            Database.movies.add(movie3);
            Database.movies.add(movie4);
            Database.movies.add(movie5);
            Database.movies.add(movie6);
            Database.movies.add(movie7);
            Database.movies.add(movie8);


            while (true) {
                System.out.println("\nCHOOSE\n1.Find movie\n2.Sort movie");
                switch (scanner.nextInt()) {
                    case 1:
                        try {
                            boolean check = true;
                            while (check) {
                                System.out.println("FIND \n1.ALL\n2.By Name\n3.By Actor name\n4.By Year\n5.By Producer\n6.By Genre\n7.By Role\n8.Back tp main");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        try {


                                            System.out.println(movieFindableService.getAllmovies());
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 2:
                                        try {
                                            System.out.println("write full name");
                                            System.out.println(movieFindableService.findMovieByFullName(scanner2.nextLine()));
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 3:
                                        try {
                                            System.out.println("write actor full name");
                                            movieFindableService.findMovieByActorName(scanner2.nextLine());
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 4:
                                        try {
                                            System.out.println("write year");
                                            movieFindableService.findMovieByYear(scanner1.nextInt());
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 5:
                                        try {
                                            System.out.println("write Producer name");
                                            movieFindableService.findMovieByProducer(scanner2.nextLine());
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 6:
                                        try {
                                            System.out.println("write Genre");

                                            String genre = scanner2.nextLine().toUpperCase();
                                            Genre genre1 = Genre.valueOf(genre);
                                            movieFindableService.findMovieByGenre(genre1);
                                        } catch (IllegalArgumentException e) {
                                            System.out.println("Некорректный жанр! Пожалуйста, выберите из доступных: FICTION, SCIENCE и т.д.");
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 7:
                                        try {
                                            System.out.println("write Role");
                                            movieFindableService.findMovieByRole(scanner2.nextLine());
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 8:
                                        check = false;
                                        break;
                                    default:
                                        System.out.println("Choose the true one");
                                        break;

                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Ошибка: " + e.getMessage());
                            scanner.nextLine();
                            scanner1.nextLine();
                            scanner2.nextLine();
                        }
                        break;


                    case 2:
                        try {
                            boolean check = true;
                            while (check) {
                                System.out.println("SORT \n1.By year\n2.By name\n3.Producer\n4.Back to main");
                                switch (scanner.nextInt()) {
                                    case 1:
                                        try {
                                            movieSortableService.sortByYear();
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 2:
                                        try {
                                            movieSortableService.sortMovieByName();
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 3:
                                        try {
                                            movieSortableService.sortByProducer();
                                        } catch (Exception e) {
                                            System.out.println("Ошибка: " + e.getMessage());
                                            scanner.nextLine();
                                            scanner1.nextLine();
                                            scanner2.nextLine();
                                        }
                                        break;
                                    case 4:
                                        check=false;
                                        break;
                                    default:
                                        System.out.println("Choose the true one");

                                }break;
                            }
                        } catch (Exception e) {
                            System.out.println("Ошибка: " + e.getMessage());
                            scanner.nextLine();
                            scanner1.nextLine();
                            scanner2.nextLine();

                        }
                    default:
                        System.out.println("Choose the true one");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            scanner.nextLine();
            scanner1.nextLine();
            scanner2.nextLine();
        } finally {
            scanner.close();
            scanner1.close();
            scanner2.close();
        }
    }
}
