package com.btanabe.mre.test.fixtures;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbResponseFixtures {

    public static String edgeOfTomorrowFullPlotJsonFixture() throws IOException {
        return FileUtils.readFileToString(new File("./src/test/resources/json/tt1631867.json"), Charset.forName("UTF8"));
    }
}
