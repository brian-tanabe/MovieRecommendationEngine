package com.btanabe.mre.json;

import com.google.gson.Gson;

/**
 * Created by Brian on 2/22/15.
 */
public class OmdbMoviePojoFactory {

    public static OmdbMoviePojo createOmdbMoviePojo(String jsonString) {
        Gson gson = new Gson();
        return gson.fromJson(jsonString, OmdbMoviePojo.class);
    }
}
