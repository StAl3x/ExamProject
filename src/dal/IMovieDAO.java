package dal;

import be.Movie;

import java.util.List;

public interface IMovieDAO {
    //crud
    void createMovie(Movie movie) throws Exception;
    void replaceMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovie(Movie movie);
    List<Movie> getAllMovies();

}
