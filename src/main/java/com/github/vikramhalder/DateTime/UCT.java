package com.github.vikramhalder.DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class UCT{
    public static String nowUTC(){
        try{
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            final String utcTime = sdf.format(new Date());
            return utcTime;
        }catch (Exception ex){
            return null;
        }
    }
    public static String nowUTC(String formet){
        try{
            final SimpleDateFormat sdf = new SimpleDateFormat(formet);
            sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
            final String utcTime = sdf.format(new Date());
            return utcTime;
        }catch (Exception ex){
            return null;
        }
    }
    public static String uctToLocalDate(String timezoon){
        try{
            DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = utcFormat.parse(timezoon);
            DateFormat pstFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
            return pstFormat.format(date);
        }catch (Exception ex){
            return timezoon;
        }
    }
    public static String uctToLocalDate(String timezoon,String formet){
        try{
            DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = utcFormat.parse(timezoon);
            DateFormat pstFormat = new SimpleDateFormat(formet);
            return pstFormat.format(date);
        }catch (Exception ex){
            return timezoon;
        }
    }
    public static String uctToLocalTime(String timezoon){
        try{
            DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = utcFormat.parse(timezoon);
            DateFormat pstFormat = new SimpleDateFormat("hh:mm:ss a");
            return pstFormat.format(date);
        }catch (Exception ex){
            return timezoon;
        }
    }
    public static String uctToLocalTime(String timezoon,String format){
        try{
            DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = utcFormat.parse(timezoon);
            DateFormat pstFormat = new SimpleDateFormat(format);
            return pstFormat.format(date);
        }catch (Exception ex){
            return timezoon;
        }
    }
}
