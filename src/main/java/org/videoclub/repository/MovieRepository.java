package org.videoclub.repository;

import org.videoclub.config.DBManager;
import org.videoclub.model.Movie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    public void createMovie(Movie movie) {
        String sql = "INSERT INTO movies(year, duration, title, director, sinopsis, language, genre, rating) VALUES (?,?,?,?,?,?,?,?)";

        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, movie.getYear());
            statement.setInt(2, movie.getDuration());
            statement.setString(3, movie.getTitle());
            statement.setString(4, movie.getDirector());
            statement.setString(5, movie.getSinopsis());
            statement.setString(6, movie.getLanguage());
            statement.setString(7, movie.getGenre());
            statement.setDouble(8, movie.getRating());



            statement.executeUpdate(); // mejor que execute()

            System.out.println("Película creada");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
    }
}
public List<Movie> findAll() {
    List<Movie> movies = new ArrayList<>();
    String sql = "SELECT * FROM movies";

        try (Connection connection = DBManager.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet rs = statement.executeQuery()) {

            while (rs.next()) {
                Movie movie = new Movie(
                        rs.getInt("year"),
                        rs.getInt("duration"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("sinopsis"),
                        rs.getString("language"),
                        rs.getString("genre"),
                rs.getDouble("rating"));

                movies.add(movie);
            }

        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());

        } finally {
            DBManager.closeConnection();
        }

        return movies;
    }
    }


