package gui;


import be.Movie;
import dal.MovieDAO;

public class pvcController {
    MovieDAO movieDAO = new MovieDAO();
    Movie movie = new Movie("Jano", "Jano2");
    movie

    public void pokus(){
        movieDAO.createMovie(movie);
    }
}
