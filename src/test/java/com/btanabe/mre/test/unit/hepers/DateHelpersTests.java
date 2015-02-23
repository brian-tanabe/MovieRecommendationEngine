package com.btanabe.mre.test.unit.hepers;

import com.btanabe.mre.helpers.DateHelpers;
import org.junit.Test;

import java.text.ParseException;
import java.util.Calendar;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by Brian on 2/22/15.
 */
public class DateHelpersTests {

    @Test
    public void shouldBeAbleToParseDateStringsProperlyFor22Feb2015() {
        try {
            Calendar calendar = DateHelpers.getCalendar("dd MMM yyyy", "22 Feb 2015");

            assertEquals("The year was not parsed properly", 2015, calendar.get(Calendar.YEAR));
            assertEquals("The month was not parsed properly", 1, calendar.get(Calendar.MONTH));
            assertEquals("The day of month was not parsed properly", 22, calendar.get(Calendar.DAY_OF_MONTH));
        } catch (ParseException e) {
            e.printStackTrace();
            fail("Failed to parse date string properly");
        }
    }

    @Test
    public void shouldBeAbleToCreateCalendarObjectsProperlyFor20Mar2015() {
        Calendar calendar = DateHelpers.getCalendar(2015, 2, 20);

        assertEquals("The year was not parsed properly", 2015, calendar.get(Calendar.YEAR));
        assertEquals("The month was not parsed properly", 2, calendar.get(Calendar.MONTH));
        assertEquals("The day of month was not parsed properly", 20, calendar.get(Calendar.DAY_OF_MONTH));
    }
}
