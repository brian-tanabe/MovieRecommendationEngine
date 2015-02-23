package com.btanabe.mre.test.fixtures;

import com.btanabe.mre.helpers.DateHelpers;
import com.btanabe.mre.helpers.MoneyHelper;
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
        OmdbMoviePojo movie = new OmdbMoviePojo();
        movie.setTitle("Edge of Tomorrow");
        movie.setYear("2014");
        movie.setRated("PG-13");
        movie.setReleased("06 Jun 2014");
        movie.setRuntime("113 min");
        movie.setGenre("Action, Sci-Fi");
        movie.setDirector("Doug Liman");
        movie.setWriter("Christopher McQuarrie (screenplay), Jez Butterworth (screenplay), John-Henry Butterworth (screenplay), Hiroshi Sakurazaka (novel)");
        movie.setActors("Tom Cruise, Emily Blunt, Brendan Gleeson, Bill Paxton");
        movie.setPlot("An alien race has hit the Earth in an unrelenting assault, unbeatable by any military unit in the world. Major William Cage (Cruise) is an officer who has never seen a day of combat when he is unceremoniously dropped into what amounts to a suicide mission. Killed within minutes, Cage now finds himself inexplicably thrown into a time loop-forcing him to live out the same brutal combat over and over, fighting and dying again...and again. But with each battle, Cage becomes able to engage the adversaries with increasing skill, alongside Special Forces warrior Rita Vrataski (Blunt). And, as Cage and Vrataski take the fight to the aliens, each repeated encounter gets them one step closer to defeating the enemy!");
        movie.setLanguage("English");
        movie.setCountry("USA, Canada");
        movie.setAwards("10 wins & 15 nominations.");
        movie.setPoster("http://ia.media-imdb.com/images/M/MV5BMTc5OTk4MTM3M15BMl5BanBnXkFtZTgwODcxNjg3MDE@._V1_SX300.jpg");
        movie.setMetascore("71");
        movie.setImdbRating("8.0");
        movie.setImdbVotes("287,270");
        movie.setImdbID("tt1631867");
        movie.setType("movie");
        movie.setTomatoMeter("90");
        movie.setTomatoImage("certified");
        movie.setTomatoRating("7.5");
        movie.setTomatoReviews("266");
        movie.setTomatoFresh("240");
        movie.setTomatoRotten("26");
        movie.setTomatoConsensus("Gripping, well-acted, funny, and clever, Edge of Tomorrow offers entertaining proof that Tom Cruise is still more than capable of shouldering the weight of a blockbuster action thriller.");
        movie.setTomatoUserMeter("90");
        movie.setTomatoUserRating("4.2");
        movie.setTomatoUserReviews("137,102");
        movie.setDVD("07 Oct 2014");
        movie.setBoxOffice("$100.1M");
        movie.setProduction("Warner Bros. Pictures");
        movie.setWebsite("http://www.edgeoftomorrowmovie.com");
        movie.setResponse("True");
        return movie;
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
        movie.setTomatoMeter(90);
        movie.setTomatoImage("certified");
        movie.setTomatoRating(7.5);
        movie.setTomatoReviews(266);
        movie.setTomatoFresh(240);
        movie.setTomatoRotten(26);
        movie.setTomatoConsensus("Gripping, well-acted, funny, and clever, Edge of Tomorrow offers entertaining proof that Tom Cruise is still more than capable of shouldering the weight of a blockbuster action thriller.");
        movie.setTomatoUserMeter(90);
        movie.setTomatoUserRating(4.2);
        movie.setTomatoUserReviews(137102);
        movie.setDVD(DateHelpers.getCalendar("dd MMM yyyy", "07 Oct 2014"));
        movie.setBoxOffice(MoneyHelper.getRealDollarValue("$100.1M"));
        movie.setProduction("Warner Bros. Pictures");
        movie.setWebsite("http://www.edgeoftomorrowmovie.com");
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
