package com.btanabe.mre.nlp.filter;

import java.util.List;

/**
 * Created by Brian on 2/22/15.
 */
public class CastAndCharacterNameFilter implements FilterI {
    private List<String> castList;
    private List<String> characterList;

    public CastAndCharacterNameFilter(List<String> castList, List<String> characterList) {
        this.castList = castList;
        this.characterList = characterList;
    }

    @Override
    public String filterString(String inputString) {
        return null;
    }
}
