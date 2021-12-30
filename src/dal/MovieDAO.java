package dal;

import be.Movie;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class MovieDAO  implements IMovieDAO{
    private dbConnector dbConnector;

    public MovieDAO(){dbConnector = new dbConnector();}

    public void createMovie(Movie movie) throws Exception {
        try(Connection connection = dbConnector.getConnection()){
            String name = movie.getName();
            float personalRating = movie.getPersonalRating();
            float imdbRating = movie.getImdbRating();
            String fileLink = movie.getFileLink();
            Date lastView = movie.getLastView();

            String q = "INSERT INTO Movies (name, personalRating, imdbRating, filelinkRating, lastView) VALUES" +
                    "("+name+ personalRating+imdbRating+fileLink+lastView.toString()+");";
        }
        catch (SQLException exception){
            throw new DataException("Cant connect to DB", exception);
        }
    }

    @Override
    public void replaceMovie(Movie movie) {

    }

    @Override
    public void updateMovie(Movie movie) {

    }

    @Override
    public void deleteMovie(Movie movie) {

    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }


}
