package com.btanabe.mre.test.web;

import com.btanabe.mre.json.OmdbMovieFactory;
import com.btanabe.mre.test.fixtures.OmdbSerializationFixtures;
import org.junit.Test;

import java.text.ParseException;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMovieFactoryTests {

    @Test
    public void shouldBeAbleToCreateAnOmdbMovieObjectProperly() {
        try {
            assertEquals("Did not create the OmdbMovie object properly", OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMovie(), OmdbMovieFactory.createOmdbMovie(OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMoviePojo()));
        } catch (ParseException e) {
            e.printStackTrace();
            fail("Failed to create test objects properly");
        }
    }
}
