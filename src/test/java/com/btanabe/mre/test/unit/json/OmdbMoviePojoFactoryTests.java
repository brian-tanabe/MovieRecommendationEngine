package com.btanabe.mre.test.unit.json;

import com.btanabe.mre.json.OmdbMoviePojo;
import com.btanabe.mre.json.OmdbMoviePojoFactory;
import com.btanabe.mre.test.fixtures.OmdbResponseFixtures;
import com.btanabe.mre.test.fixtures.OmdbSerializationFixtures;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMoviePojoFactoryTests {
    private static OmdbMoviePojo goldMovie;
    private static OmdbMoviePojo movieFromFactory;

    @BeforeClass
    public static void setup() {
        try {
            goldMovie = OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMoviePojo();
            movieFromFactory = OmdbMoviePojoFactory.createOmdbMoviePojo(OmdbResponseFixtures.edgeOfTomorrowFullPlotJsonFixture());
        } catch (Exception e) {
            e.printStackTrace();
            fail("Failed to serialize the test OmdbMoviePojo object");
        }
    }

    @Test
    public void shouldBeAbleToParseTheTitleProperly() {
        assertEquals("Did not parse the title correctly", goldMovie.getTitle(), movieFromFactory.getTitle());
    }

    @Test
    public void shouldBeAbleToParseTheYearProperly() {
        assertEquals("Did not parse its year properly", goldMovie.getYear(), movieFromFactory.getYear());
    }

    @Test
    public void shouldBeAbleToParseTheRatingProperly() {
        assertEquals("Did not parse its rating properly", goldMovie.getRated(), movieFromFactory.getRated());
    }

    @Test
    public void shouldBeAbleToParseTheReleaseDateProperly() {
        assertEquals("Did not parse its release date properly", goldMovie.getReleased(), movieFromFactory.getReleased());
    }

    @Test
    public void shouldBeAbleToParseTheRunningTimeProperly() {
        assertEquals("Did not parse its running time properly", goldMovie.getRuntime(), movieFromFactory.getRuntime());
    }

    @Test
    public void shouldBeAbleToParseTheGenresProperly() {
        assertEquals("Did not parse its genres properly", goldMovie.getGenre(), movieFromFactory.getGenre());
    }

    @Test
    public void shouldBeAbleToParseTheDirectorProperly() {
        assertEquals("Did not parse its director properly", goldMovie.getDirector(), movieFromFactory.getDirector());
    }

    @Test
    public void shouldBeAbleToParseTheWritersProperly() {
        assertEquals("Did not parse its writers properly", goldMovie.getWriter(), movieFromFactory.getWriter());
    }

    @Test
    public void shouldBeAbleToParseTheActorsProperly() {
        assertEquals("Did not parse its actors properly", goldMovie.getActors(), movieFromFactory.getActors());
    }

    @Test
    public void shouldBeAbleToParseThePlotSummaryProperly() {
        assertEquals("Did not parse its plot summary properly", goldMovie.getPlot(), movieFromFactory.getPlot());
    }

    @Test
    public void shouldBeAbleToParseTheLanguagesProperly() {
        assertEquals("Did not parse its language properly", goldMovie.getLanguage(), movieFromFactory.getLanguage());
    }

    @Test
    public void shouldBeAbleToParseTheCountriesProperly() {
        assertEquals("Did not parse its countries properly", goldMovie.getCountry(), movieFromFactory.getCountry());
    }

    @Test
    public void shouldBeAbleToParseTheAwardsProperly() {
        assertEquals("Did not parse its awards properly", goldMovie.getAwards(), movieFromFactory.getAwards());
    }

    @Test
    public void shouldBeAbleToParseThePosterUrlProperly() {
        assertEquals("Did not parse its poster URL properly", goldMovie.getPoster(), movieFromFactory.getPoster());
    }

    @Test
    public void shouldBeAbleToParseTheMetascoreProperly() {
        assertEquals("Did not parse its metascore properly", goldMovie.getMetascore(), movieFromFactory.getMetascore());
    }

    @Test
    public void shouldBeAbleToParseTheImdbRatingProperly() {
        assertEquals("Did not parse its IMDB rating properly", goldMovie.getImdbRating(), movieFromFactory.getImdbRating());
    }

    @Test
    public void shouldBeAbleToParseTheImdbVotesProperly() {
        assertEquals("Did not parse its IMDB votes properly", goldMovie.getImdbVotes(), movieFromFactory.getImdbVotes());
    }

    @Test
    public void shouldBeAbleToParseTheImdbIdProperly() {
        assertEquals("Did not parse its IMDB ID properly", goldMovie.getImdbID(), movieFromFactory.getImdbID());
    }

    @Test
    public void shouldBeAbleToParseTheMediaTypeProperly() {
        assertEquals("Did not parse its media type properly", goldMovie.getType(), movieFromFactory.getType());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoMeterProperly() {
        assertEquals("Did not parse its tomato meter properly", goldMovie.getTomatoMeter(), movieFromFactory.getTomatoMeter());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoImageProperly() {
        assertEquals("Did not parse its tomato image properly", goldMovie.getTomatoImage(), movieFromFactory.getTomatoImage());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoRatingProperly() {
        assertEquals("Did not parse its tomato rating properly", goldMovie.getTomatoRating(), movieFromFactory.getTomatoRating());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoReviewsProperly() {
        assertEquals("Did not parse its tomato reviews properly", goldMovie.getTomatoReviews(), movieFromFactory.getTomatoReviews());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoFreshProperly() {
        assertEquals("Did not parse its tomato fresh properly", goldMovie.getTomatoFresh(), movieFromFactory.getTomatoFresh());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoRottenProperly() {
        assertEquals("Did not parse its tomato rotten properly", goldMovie.getTomatoRotten(), movieFromFactory.getTomatoRotten());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoConsensusProperly() {
        assertEquals("Did not parse its tomato consensus properly", goldMovie.getTomatoConsensus(), movieFromFactory.getTomatoConsensus());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoUserMeterProperly() {
        assertEquals("Did not parse its tomato user meter properly", goldMovie.getTomatoUserMeter(), movieFromFactory.getTomatoUserMeter());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoUserRatingProperly() {
        assertEquals("Did not parse its tomato user rating properly", goldMovie.getTomatoUserRating(), movieFromFactory.getTomatoUserRating());
    }

    @Test
    public void shouldBeAbleToParseTheTomatoUserReviewsProperly() {
        assertEquals("Did not parse its tomato user reviews properly", goldMovie.getTomatoUserReviews(), movieFromFactory.getTomatoUserReviews());
    }

    @Test
    public void shouldBeAbleToParseTheDvdReleaseDateProperly() {
        assertEquals("Did not parse its DVD release date properly", goldMovie.getDVD(), movieFromFactory.getDVD());
    }

    @Test
    public void shouldBeAbleToParseTheBoxOfficeRunProperly() {
        assertEquals("Did not parse its box office run properly", goldMovie.getBoxOffice(), movieFromFactory.getBoxOffice());
    }

    @Test
    public void shouldBeAbleToParseTheProductionStudioProperly() {
        assertEquals("Did not parse its production studio properly", goldMovie.getProduction(), movieFromFactory.getProduction());
    }

    @Test
    public void shouldBeAbleToParseTheWebsiteProperly() {
        assertEquals("Did not parse its website properly", goldMovie.getWebsite(), movieFromFactory.getWebsite());
    }

    @Test
    public void shouldBeAbleToParseTheResponseProperly() {
        assertEquals("Did not parse its response properly", goldMovie.getResponse(), movieFromFactory.getResponse());
    }

}
