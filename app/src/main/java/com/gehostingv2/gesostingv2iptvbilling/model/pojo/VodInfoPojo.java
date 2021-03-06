package com.gehostingv2.gesostingv2iptvbilling.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VodInfoPojo {

    @SerializedName("imdb_id")
    @Expose
    private String imdbId;
    @SerializedName("movie_image")
    @Expose
    private String movieImage;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("plot")
    @Expose
    private String plot;
    @SerializedName("cast")
    @Expose
    private String cast;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("director")
    @Expose
    private String director;
    @SerializedName("releasedate")
    @Expose
    private String releasedate;

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }
}