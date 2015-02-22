package com.btanabe.mre.json;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMoviePojo {
    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Writer;
    private String Actors;
    private String Plot;
    private String Language;
    private String Country;
    private String Awards;
    private String Poster;
    private String Metascore;
    private String imdbRating;
    private String imdbVotes;
    private String imdbID;
    private String Type;
    private String Response;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String rated) {
        Rated = rated;
    }

    public String getReleased() {
        return Released;
    }

    public void setReleased(String released) {
        Released = released;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getActors() {
        return Actors;
    }

    public void setActors(String actors) {
        Actors = actors;
    }

    public String getPlot() {
        return Plot;
    }

    public void setPlot(String plot) {
        Plot = plot;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAwards() {
        return Awards;
    }

    public void setAwards(String awards) {
        Awards = awards;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getMetascore() {
        return Metascore;
    }

    public void setMetascore(String metascore) {
        Metascore = metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OmdbMoviePojo)) return false;

        OmdbMoviePojo that = (OmdbMoviePojo) o;

        if (!Actors.equals(that.Actors)) return false;
        if (!Awards.equals(that.Awards)) return false;
        if (!Country.equals(that.Country)) return false;
        if (!Director.equals(that.Director)) return false;
        if (!Genre.equals(that.Genre)) return false;
        if (!Language.equals(that.Language)) return false;
        if (!Metascore.equals(that.Metascore)) return false;
        if (!Plot.equals(that.Plot)) return false;
        if (!Poster.equals(that.Poster)) return false;
        if (!Rated.equals(that.Rated)) return false;
        if (!Released.equals(that.Released)) return false;
        if (!Response.equals(that.Response)) return false;
        if (!Runtime.equals(that.Runtime)) return false;
        if (!Title.equals(that.Title)) return false;
        if (!Type.equals(that.Type)) return false;
        if (!Writer.equals(that.Writer)) return false;
        if (!Year.equals(that.Year)) return false;
        if (!imdbID.equals(that.imdbID)) return false;
        if (!imdbRating.equals(that.imdbRating)) return false;
        if (!imdbVotes.equals(that.imdbVotes)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Title.hashCode();
        result = 31 * result + Year.hashCode();
        result = 31 * result + Rated.hashCode();
        result = 31 * result + Released.hashCode();
        result = 31 * result + Runtime.hashCode();
        result = 31 * result + Genre.hashCode();
        result = 31 * result + Director.hashCode();
        result = 31 * result + Writer.hashCode();
        result = 31 * result + Actors.hashCode();
        result = 31 * result + Plot.hashCode();
        result = 31 * result + Language.hashCode();
        result = 31 * result + Country.hashCode();
        result = 31 * result + Awards.hashCode();
        result = 31 * result + Poster.hashCode();
        result = 31 * result + Metascore.hashCode();
        result = 31 * result + imdbRating.hashCode();
        result = 31 * result + imdbVotes.hashCode();
        result = 31 * result + imdbID.hashCode();
        result = 31 * result + Type.hashCode();
        result = 31 * result + Response.hashCode();
        return result;
    }
}
