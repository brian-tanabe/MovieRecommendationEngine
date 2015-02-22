package com.btanabe.mre.test.fixtures;

import com.btanabe.mre.json.OmdbMoviePojo;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbJsonSerializationFixtures {

    public static OmdbMoviePojo getEdgeOfTomorrowPojo() {
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
}
