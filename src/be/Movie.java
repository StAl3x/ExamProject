package be;

import javafx.scene.media.Media;

import java.io.File;
import java.util.Date;

public class Movie {
    private String name;
    private float personalRating;
    private float imdbRating;
    private String fileLink;
    private Date lastView;
    private Media movieAsMedia;

    public Movie(String name, String fileLink){
        this.name = name;
        this.fileLink = fileLink;
        File f = new File(fileLink);
        this.movieAsMedia =  new Media((f.toURI().toString()));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPersonalRating() {
        return personalRating;
    }

    public void setPersonalRating(float personalRating) {
        this.personalRating = personalRating;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public Date getLastView() {
        return lastView;
    }

    public void setLastView(Date lastView) {
        this.lastView = lastView;
    }

    public Media getMovieAsMedia() {
        return movieAsMedia;
    }

    public void setMovieAsMedia(Media movieAsMedia) {
        this.movieAsMedia = movieAsMedia;
    }



}
