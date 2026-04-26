package org.videoclub.view;

import org.videoclub.controller.MovieController;
import org.videoclub.model.Movie;

import java.util.List;
import java.util.Scanner;

public class MovieView {

    private MovieController movieController;

    public MovieView(MovieController movieController) {
        this.movieController = movieController;
    }

    public void generateMovie() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba los siguientes datos de la película:");

        System.out.println("Año: ");
        int year = scanner.nextInt();

        System.out.println("Duración: ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Título: ");
        String title = scanner.nextLine();

        System.out.println("Director: ");
        String director = scanner.nextLine();

        System.out.println("Sinopsis: ");
        String sinopsis = scanner.nextLine();


        System.out.println("Idioma: ");
        String language = scanner.nextLine();

        System.out.println("Género: ");
        String gender = scanner.nextLine();


        System.out.println("Puntuación: ");
        double rankup = scanner.nextDouble();

        Movie movie = new Movie(year, duration, title,sinopsis, director, language,gender, rankup);
        movieController.createMovie(movie);

        scanner.close();
    }

    public void showMovies() {
        List<Movie> movieList = movieController.findAll();

        for (Movie movie : movieList) {
            System.out.println("Año: " + movie.getYear()
                    + " Duración: " + movie.getDuration()
                    + " Título: " + movie.getTitle()
                    + " Director: " + movie.getDirector()
                    + " Sinopsis: " + movie.getSinopsis()
                    + " Idioma: " + movie.getLanguage()
                    + " Género: " + movie.getGenre()
                    + " Puntuación: " + movie.getRating());
        }
    }

}
