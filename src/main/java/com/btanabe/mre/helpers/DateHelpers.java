package com.btanabe.mre.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Brian on 2/22/15.
 */
public class DateHelpers {

    public static Calendar getCalendar(int year, int monthZeroIndexed, int dayOffsetIndexed) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, monthZeroIndexed);
        calendar.set(Calendar.DAY_OF_MONTH, dayOffsetIndexed);
        return calendar;
    }

    public static Calendar getCalendar(String dateFormatString, String dateString) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        Date result = dateFormat.parse(dateString);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(result);
        return calendar;
    }
}
