package com.btanabe.mre.test.unit.nlp.filter;

import org.junit.BeforeClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brian on 2/22/15.
 */
public class CastAndCharacterNameFilterTests {
    private static List<String> castList;
    private static List<String> characterList;

    @BeforeClass
    public static void setup() {
        castList = new ArrayList<>();
        castList.add("Tom Cruise");
        castList.add("Emily Blunt");
        castList.add("Brendan Gleeson");
        castList.add("Bill Paxton");

        characterList = new ArrayList<>();
    }
}
