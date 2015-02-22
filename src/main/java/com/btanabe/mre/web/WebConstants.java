package com.btanabe.mre.web;

/**
 * Created by Brian on 2/22/15.
 */
public class WebConstants {
    public static final String USER_AGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.10; rv:32.0) Gecko/20100101 Firefox/32.0";

    // OMDb:
    public static String getOmdbUrlFromImbdId(String imbdMovieId) {
        return String.format("http://www.omdbapi.com/?i=%s&plot=full&r=json", imbdMovieId);
    }
}
