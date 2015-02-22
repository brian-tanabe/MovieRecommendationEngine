package com.btanabe.mre.test.web;

import com.btanabe.mre.json.OmdbMoviePojoFactory;
import com.btanabe.mre.test.fixtures.OmdbSerializationFixtures;
import com.btanabe.mre.test.fixtures.OmdbResponseFixtures;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMoviePojoFactoryTests {

    @Test
    public void shouldBeAbleToSerializeEdgeOfTomorrowJson() {
        try {
            assertEquals("Omdb POJO objects did not match", OmdbSerializationFixtures.getEdgeOfTomorrowOmdbMoviePojo(), OmdbMoviePojoFactory.createOmdbMoviePojo(OmdbResponseFixtures.edgeOfTomorrowFullPlotJsonFixture()));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Failed to create test POJO objects");
        }
    }
}
