package org.videoclub.controller;

import org.videoclub.model.Movie;
import org.videoclub.repository.MovieRepository;

import java.util.List;

public class MovieController {

    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieService){
        this.movieRepository = movieService;
    }

    public void createMovie(Movie movie) {
        movieRepository.createMovie(movie);
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
