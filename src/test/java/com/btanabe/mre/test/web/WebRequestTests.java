package com.btanabe.mre.test.web;

import com.btanabe.mre.web.WebRequest;
import org.junit.Test;

import java.io.IOException;

import static com.btanabe.mre.test.fixtures.OmdbResponseFixtures.edgeOfTomorrowFullPlotJsonFixture;
import static com.btanabe.mre.web.WebConstants.getOmdbUrlFromImbdId;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class WebRequestTests {

    @Test
    public void shouldBeAbleToDownloadEdgeOfTomorrowMovieInformationFromOmdb() {
        try {
            String json = new WebRequest().getPage(getOmdbUrlFromImbdId("tt1631867"));
            assertEquals("OMDb response did not match", edgeOfTomorrowFullPlotJsonFixture(), json);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Failed to download movie information from OMDb");
        }
    }
}
