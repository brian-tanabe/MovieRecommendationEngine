package com.btanabe.mre.test.unit.hepers;

import com.btanabe.mre.helpers.MoneyHelper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class MoneyHelpersTests {

    @Test
    public void shouldBeAbleToConvertOneHundredAndOneMillionDollars() {
        assertEquals("Was not able to convert $101.1M properly", 100100000, MoneyHelper.getRealDollarValue("$100.1M"));
    }

    @Test
    public void shouldBeAbleToConvertOneMillionDollars() {
        assertEquals("Was not able to convert $1M properly", 1000000, MoneyHelper.getRealDollarValue("$1M"));
    }

    @Test
    public void shouldBeAbleToConvertTwentyFourThousandSixHundredDollars() {
        assertEquals("Was not able to convert $24.6k properly", 24600, MoneyHelper.getRealDollarValue("$24.6k"));
    }

    @Test
    public void shouldBeAbleToConvertValuesWhoseSignificandIsLessThanOne() {
        assertEquals("Was not able to convert $0.1k properly", 100, MoneyHelper.getRealDollarValue("$0.1k"));
        assertEquals("Was not able to convert $.1k properly", 100, MoneyHelper.getRealDollarValue("$.1k"));

        assertEquals("Was not able to convert $0.1M properly", 100000, MoneyHelper.getRealDollarValue("$0.1M"));
        assertEquals("Was not able to convert $.1M properly", 100000, MoneyHelper.getRealDollarValue("$.1M"));
    }
}
