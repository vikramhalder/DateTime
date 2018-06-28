package com.github.vikramhalder.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CurrentDT {
    public static String toStr(String format){
        SimpleDateFormat sdfDate = new SimpleDateFormat(format);
        java.util.Date now = new java.util.Date();
        String strDate = sdfDate.format(now);
        return strDate;
    }
    public static Date toDate(String format){
        Date now = new java.util.Date();
        return now;
    }
}
