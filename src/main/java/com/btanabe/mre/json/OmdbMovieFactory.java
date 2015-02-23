package com.btanabe.mre.json;

import com.btanabe.mre.helpers.DateHelpers;
import com.btanabe.mre.helpers.MoneyHelper;
import com.btanabe.mre.movie.MpaaRating;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMovieFactory {

    public static OmdbMovie createOmdbMovie(OmdbMoviePojo omdbMoviePojo) throws ParseException {
        OmdbMovie movie = new OmdbMovie();

        movie.setTitle(omdbMoviePojo.getTitle());
        movie.setYear(Integer.parseInt(omdbMoviePojo.getYear()));
        movie.setRating(MpaaRating.whatRating(omdbMoviePojo.getRated()));
        movie.setReleased(DateHelpers.getCalendar("dd MMM yyyy", omdbMoviePojo.getReleased()));
        movie.setRuntimeInMinutes(parseRuntime(omdbMoviePojo.getRuntime()));
        movie.setGenres(Stream.of(omdbMoviePojo.getGenre().split(", ")).collect(Collectors.toList()));
        movie.setDirector(omdbMoviePojo.getDirector());
        movie.setWriter(parseWriters(omdbMoviePojo.getWriter()));
        movie.setActors(Stream.of(omdbMoviePojo.getActors().split(", ")).collect(Collectors.toList()));
        movie.setPlotSummary(omdbMoviePojo.getPlot());
        movie.setLanguage(omdbMoviePojo.getLanguage());
        movie.setCounties(Stream.of(omdbMoviePojo.getCountry().split(", ")).collect(Collectors.toList()));
        movie.setAwardNominationsAndWins(omdbMoviePojo.getAwards());
        movie.setPosterUrl(omdbMoviePojo.getPoster());
        movie.setMetascore(Integer.parseInt(omdbMoviePojo.getMetascore()));
        movie.setImdbRating(Double.parseDouble(omdbMoviePojo.getImdbRating()));
        movie.setImdbVotes(Integer.parseInt(omdbMoviePojo.getImdbVotes().replaceAll("[^\\d]", "")));
        movie.setImdbID(omdbMoviePojo.getImdbID());
        movie.setMediaType(omdbMoviePojo.getType());
        movie.setTomatoMeter(Integer.parseInt(omdbMoviePojo.getTomatoMeter()));
        movie.setTomatoImage(omdbMoviePojo.getTomatoImage());
        movie.setTomatoRating(Double.parseDouble(omdbMoviePojo.getTomatoRating()));
        movie.setTomatoReviews(Integer.parseInt(omdbMoviePojo.getTomatoReviews()));
        movie.setTomatoFresh(Integer.parseInt(omdbMoviePojo.getTomatoFresh()));
        movie.setTomatoRotten(Integer.parseInt(omdbMoviePojo.getTomatoRotten()));
        movie.setTomatoConsensus(omdbMoviePojo.getTomatoConsensus());
        movie.setTomatoUserMeter(Integer.parseInt(omdbMoviePojo.getTomatoUserMeter()));
        movie.setTomatoUserRating(Double.parseDouble(omdbMoviePojo.getTomatoUserRating()));
        movie.setTomatoUserReviews(Integer.parseInt(omdbMoviePojo.getTomatoUserReviews().replaceAll("[^0-9]", "")));
        movie.setDVD(DateHelpers.getCalendar("dd MMM yyyy", omdbMoviePojo.getDVD()));
        movie.setBoxOffice(MoneyHelper.getRealDollarValue(omdbMoviePojo.getBoxOffice()));
        movie.setProduction(omdbMoviePojo.getProduction());
        movie.setWebsite(omdbMoviePojo.getWebsite());
        movie.setResponse(omdbMoviePojo.getResponse().toLowerCase().equals("true"));

        return movie;
    }

    private static int parseRuntime(String runtimeString) {
        runtimeString = runtimeString.replaceAll("[^\\d]", "");
        return Integer.parseInt(runtimeString);
    }

    private static List<String> parseWriters(String writersString) {
        List<String> writerStrings = new ArrayList<>();
        Stream.of(writersString.replaceAll("\\(.+?\\)", "").split(",")).forEach(w -> writerStrings.add(w.trim()));
        return writerStrings;
    }
}
