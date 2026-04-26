package org.videoclub;


import org.videoclub.controller.MovieController;
import org.videoclub.repository.MovieRepository;
import org.videoclub.view.MovieView;

public class Main {
    static void main() {
        MovieRepository movieRepository = new MovieRepository();
        MovieController movieController = new MovieController(movieRepository);
        MovieView movieView = new MovieView(movieController);

        movieView.generateMovie();
        movieView.showMovies();
    }
}
