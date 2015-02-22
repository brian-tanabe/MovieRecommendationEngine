package com.btanabe.mre.test.fixtures;

import com.btanabe.mre.helpers.DateHelpers;
import com.btanabe.mre.json.OmdbMovie;
import com.btanabe.mre.json.OmdbMoviePojo;
import com.btanabe.mre.movie.MpaaRating;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbSerializationFixtures {

    public static OmdbMoviePojo getEdgeOfTomorrowOmdbMoviePojo() {
        OmdbMoviePojo edgeOfTomorrow = new OmdbMoviePojo();
        edgeOfTomorrow.setTitle("Edge of Tomorrow");
        edgeOfTomorrow.setYear("2014");
        edgeOfTomorrow.setRated("PG-13");
        edgeOfTomorrow.setReleased("06 Jun 2014");
        edgeOfTomorrow.setRuntime("113 min");
        edgeOfTomorrow.setGenre("Action, Sci-Fi");
        edgeOfTomorrow.setDirector("Doug Liman");
        edgeOfTomorrow.setWriter("Christopher McQuarrie (screenplay), Jez Butterworth (screenplay), John-Henry Butterworth (screenplay), Hiroshi Sakurazaka (novel)");
        edgeOfTomorrow.setActors("Tom Cruise, Emily Blunt, Brendan Gleeson, Bill Paxton");
        edgeOfTomorrow.setPlot("An alien race has hit the Earth in an unrelenting assault, unbeatable by any military unit in the world. Major William Cage (Cruise) is an officer who has never seen a day of combat when he is unceremoniously dropped into what amounts to a suicide mission. Killed within minutes, Cage now finds himself inexplicably thrown into a time loop-forcing him to live out the same brutal combat over and over, fighting and dying again...and again. But with each battle, Cage becomes able to engage the adversaries with increasing skill, alongside Special Forces warrior Rita Vrataski (Blunt). And, as Cage and Vrataski take the fight to the aliens, each repeated encounter gets them one step closer to defeating the enemy!");
        edgeOfTomorrow.setLanguage("English");
        edgeOfTomorrow.setCountry("USA, Canada");
        edgeOfTomorrow.setAwards("10 wins & 15 nominations.");
        edgeOfTomorrow.setPoster("http://ia.media-imdb.com/images/M/MV5BMTc5OTk4MTM3M15BMl5BanBnXkFtZTgwODcxNjg3MDE@._V1_SX300.jpg");
        edgeOfTomorrow.setMetascore("71");
        edgeOfTomorrow.setImdbRating("8.0");
        edgeOfTomorrow.setImdbVotes("287,270");
        edgeOfTomorrow.setImdbID("tt1631867");
        edgeOfTomorrow.setType("movie");
        edgeOfTomorrow.setResponse("True");
        return edgeOfTomorrow;
    }

    public static OmdbMovie getEdgeOfTomorrowOmdbMovie() throws ParseException {
        OmdbMovie movie = new OmdbMovie();
        movie.setTitle("Edge of Tomorrow");
        movie.setYear(2014);
        movie.setRating(MpaaRating.PG13);
        movie.setReleased(DateHelpers.getCalendar("dd MMM yyyy", "06 Jun 2014"));
        movie.setRuntimeInMinutes(113);
        movie.setGenres(getEdgeOfTomorrowGenreList());
        movie.setDirector("Doug Liman");
        movie.setWriter(getEdgeOfTomorrowWriterList());
        movie.setActors(getEdgeOfTomorrowActorList());
        movie.setPlotSummary("An alien race has hit the Earth in an unrelenting assault, unbeatable by any military unit in the world. Major William Cage (Cruise) is an officer who has never seen a day of combat when he is unceremoniously dropped into what amounts to a suicide mission. Killed within minutes, Cage now finds himself inexplicably thrown into a time loop-forcing him to live out the same brutal combat over and over, fighting and dying again...and again. But with each battle, Cage becomes able to engage the adversaries with increasing skill, alongside Special Forces warrior Rita Vrataski (Blunt). And, as Cage and Vrataski take the fight to the aliens, each repeated encounter gets them one step closer to defeating the enemy!");
        movie.setLanguage("English");
        movie.setCounties(getEdgeOfTomorrowCountryList());
        movie.setAwardNominationsAndWins("10 wins & 15 nominations.");
        movie.setPosterUrl("http://ia.media-imdb.com/images/M/MV5BMTc5OTk4MTM3M15BMl5BanBnXkFtZTgwODcxNjg3MDE@._V1_SX300.jpg");
        movie.setMetascore(71);
        movie.setImdbRating(8.0);
        movie.setImdbVotes(287270);
        movie.setImdbID("tt1631867");
        movie.setMediaType("movie");
        movie.setResponse(true);
        return movie;
    }

    private static List<String> getEdgeOfTomorrowGenreList() {
        List<String> edgeOfTomorrowGenreList = new ArrayList<>();
        edgeOfTomorrowGenreList.add("Action");
        edgeOfTomorrowGenreList.add("Sci-Fi");
        return edgeOfTomorrowGenreList;
    }

    private static List<String> getEdgeOfTomorrowWriterList() {
        List<String> edgeOfTomorrowWriterList = new ArrayList<>();
        edgeOfTomorrowWriterList.add("Christopher McQuarrie");
        edgeOfTomorrowWriterList.add("Jez Butterworth");
        edgeOfTomorrowWriterList.add("John-Henry Butterworth");
        edgeOfTomorrowWriterList.add("Hiroshi Sakurazaka");
        return edgeOfTomorrowWriterList;
    }

    private static List<String> getEdgeOfTomorrowActorList() {
        List<String> actorList = new ArrayList<>();
        actorList.add("Tom Cruise");
        actorList.add("Emily Blunt");
        actorList.add("Brendan Gleeson");
        actorList.add("Bill Paxton");
        return actorList;
    }

    private static List<String> getEdgeOfTomorrowCountryList() {
        List<String> countryList = new ArrayList<>();
        countryList.add("USA");
        countryList.add("Canada");
        return countryList;
    }
}
