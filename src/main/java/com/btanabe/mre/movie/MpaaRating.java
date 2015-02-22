package com.btanabe.mre.movie;

/**
 * Created by Brian on 2/22/15.
 */
public enum MpaaRating {
    G,
    PG,
    PG13,
    R,
    NC17,
    NR,
    UNKNOWN;

    public static MpaaRating whatRating(String rating) {
        if(rating.equals("G"))
            return MpaaRating.G;
        else if(rating.equals("PG"))
            return MpaaRating.PG;
        else if(rating.equals("PG-13"))
            return MpaaRating.PG13;
        else if(rating.equals("R"))
            return MpaaRating.R;
        else if(rating.equals("NC-17"))
            return MpaaRating.NC17;
        else if(rating.equals("NR"))
            return MpaaRating.NR;
        else
            return MpaaRating.UNKNOWN;
    }
}
