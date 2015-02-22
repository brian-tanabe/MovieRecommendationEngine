package com.btanabe.mre.test.web;

import com.btanabe.mre.json.OmdbMovie;
import org.junit.Test;

import java.text.ParseException;

import static com.btanabe.mre.json.OmdbMovieFactory.createOmdbMovie;
import static com.btanabe.mre.test.fixtures.OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMovie;
import static com.btanabe.mre.test.fixtures.OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMoviePojo;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMovieFactoryTests {

    @Test
    public void shouldBeAbleToCreate2AnOmdbMovieObjectProperly() {
        try {
            OmdbMovie goldMovie = getEdgeOfTomorrowOmdbMovie();
            OmdbMovie movieFromFactory = createOmdbMovie(getEdgeOfTomorrowOmdbMoviePojo());

            assertEquals("Did not parse its title properly", goldMovie.getTitle(), movieFromFactory.getTitle());
            assertEquals("Did not parse its year properly", goldMovie.getYear(), movieFromFactory.getYear());
            assertEquals("Did not parse its rating properly", goldMovie.getRating(), movieFromFactory.getRating());
            assertEquals("Did not parse its release date properly", goldMovie.getReleased(), movieFromFactory.getReleased());
            assertEquals("Did not parse its running time properly", goldMovie.getRuntimeInMinutes(), movieFromFactory.getRuntimeInMinutes());
            assertEquals("Did not parse its genres properly", goldMovie.getGenres(), movieFromFactory.getGenres());
            assertEquals("Did not parse its director properly", goldMovie.getDirector(), movieFromFactory.getDirector());
            assertEquals("Did not parse its writers properly", goldMovie.getWriters(), movieFromFactory.getWriters());
            assertEquals("Did not parse its actors properly", goldMovie.getActors(), movieFromFactory.getActors());
            assertEquals("Did not parse its plot summary properly", goldMovie.getPlotSummary(), movieFromFactory.getPlotSummary());
            assertEquals("Did not parse its language properly", goldMovie.getLanguage(), movieFromFactory.getLanguage());
            assertEquals("Did not parse its countries properly", goldMovie.getCounties(), movieFromFactory.getCounties());
            assertEquals("Did not parse its awards properly", goldMovie.getAwardNominationsAndWins(), movieFromFactory.getAwardNominationsAndWins());
            assertEquals("Did not parse its poster URL properly", goldMovie.getPosterUrl(), movieFromFactory.getPosterUrl());
            assertEquals("Did not parse its metascore properly", goldMovie.getMetascore(), movieFromFactory.getMetascore());
            assertEquals("Did not parse its IMDB rating properly", goldMovie.getImdbRating(), movieFromFactory.getImdbRating(), 0);
            assertEquals("Did not parse its IMDB votes properly", goldMovie.getImdbVotes(), movieFromFactory.getImdbVotes());
            assertEquals("Did not parse its IMDB ID properly", goldMovie.getImdbID(), movieFromFactory.getImdbID());
            assertEquals("Did not parse its media type properly", goldMovie.getMediaType(), movieFromFactory.getMediaType());
            assertEquals("Did not parse its response properly", goldMovie.isResponse(), movieFromFactory.isResponse());
        } catch (ParseException e) {
            e.printStackTrace();
            fail("Failed to create test objects properly");
        }
    }
}
