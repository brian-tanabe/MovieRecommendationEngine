package com.btanabe.mre.json;

import com.btanabe.mre.movie.MpaaRating;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMovie {
    private String title;
    private int year;
    private MpaaRating rating;
    private Calendar released;
    private int runtimeInMinutes;
    private List<String> genres;
    private String director;
    private List<String> writer;
    private List<String> actors;
    private String plotSummary;
    private String language;
    private List<String> counties;
    private String awardNominationsAndWins;
    private String posterUrl;
    private int metascore;
    private double imdbRating;
    private int imdbVotes;
    private String imdbID;
    private String mediaType;
    private boolean response;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MpaaRating getRating() {
        return rating;
    }

    public void setRating(MpaaRating rating) {
        this.rating = rating;
    }

    public Calendar getReleased() {
        return released;
    }

    public void setReleased(Calendar released) {
        this.released = released;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }

    public void setRuntimeInMinutes(int runtimeInMinutes) {
        this.runtimeInMinutes = runtimeInMinutes;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getWriters() {
        return writer;
    }

    public void setWriter(List<String> writer) {
        this.writer = writer;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getPlotSummary() {
        return plotSummary;
    }

    public void setPlotSummary(String plotSummary) {
        this.plotSummary = plotSummary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<String> getCounties() {
        return counties;
    }

    public void setCounties(List<String> counties) {
        this.counties = counties;
    }

    public String getAwardNominationsAndWins() {
        return awardNominationsAndWins;
    }

    public void setAwardNominationsAndWins(String awardNominationsAndWins) {
        this.awardNominationsAndWins = awardNominationsAndWins;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(int imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OmdbMovie)) return false;

        OmdbMovie omdbMovie = (OmdbMovie) o;

        if (Double.compare(omdbMovie.imdbRating, imdbRating) != 0) return false;
        if (imdbVotes != omdbMovie.imdbVotes) return false;
        if (metascore != omdbMovie.metascore) return false;
        if (response != omdbMovie.response) return false;
        if (runtimeInMinutes != omdbMovie.runtimeInMinutes) return false;
        if (year != omdbMovie.year) return false;
        if (!actors.equals(omdbMovie.actors)) return false;
        if (!awardNominationsAndWins.equals(omdbMovie.awardNominationsAndWins)) return false;
        if (!counties.equals(omdbMovie.counties)) return false;
        if (!director.equals(omdbMovie.director)) return false;
        if (!genres.equals(omdbMovie.genres)) return false;
        if (!imdbID.equals(omdbMovie.imdbID)) return false;
        if (!language.equals(omdbMovie.language)) return false;
        if (!mediaType.equals(omdbMovie.mediaType)) return false;
        if (!plotSummary.equals(omdbMovie.plotSummary)) return false;
        if (!posterUrl.equals(omdbMovie.posterUrl)) return false;
        if (rating != omdbMovie.rating) return false;
        if (!released.equals(omdbMovie.released)) return false;
        if (!title.equals(omdbMovie.title)) return false;
        if (!writer.equals(omdbMovie.writer)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title.hashCode();
        result = 31 * result + year;
        result = 31 * result + rating.hashCode();
        result = 31 * result + released.hashCode();
        result = 31 * result + runtimeInMinutes;
        result = 31 * result + genres.hashCode();
        result = 31 * result + director.hashCode();
        result = 31 * result + writer.hashCode();
        result = 31 * result + actors.hashCode();
        result = 31 * result + plotSummary.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + counties.hashCode();
        result = 31 * result + awardNominationsAndWins.hashCode();
        result = 31 * result + posterUrl.hashCode();
        result = 31 * result + metascore;
        temp = Double.doubleToLongBits(imdbRating);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + imdbVotes;
        result = 31 * result + imdbID.hashCode();
        result = 31 * result + mediaType.hashCode();
        result = 31 * result + (response ? 1 : 0);
        return result;
    }
}
