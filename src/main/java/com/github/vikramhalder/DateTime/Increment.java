package com.github.vikramhalder.DateTime;

import com.github.vikramhalder.DateTime.CurrentDT;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Increment {

    /////////////////////////////////////DATA///////////////////////////////////////////////
    public static String dtStrToStr(String type,int increment) {
        try {
            String dt = CurrentDT.toStr("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dt));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String dtStrToStr(String type,int increment,String date_str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            else if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String dtStrToStr(String type,int increment, String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            else if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }


    /////////////////////////////////////DATA///////////////////////////////////////////////
    public static String dateStrToStr(String type,int increment) {
        try {
            String dt = CurrentDT.toStr("yyyy-MM-dd");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dt));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String dateStrToStr(String type,int increment,String date_str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String dateStrToStr(String type,int increment, String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }

    /**
     *
     */
    public static Date dateStrToDate(String type,int increment) {
        try {
            String dt = CurrentDT.toStr("yyyy-MM-dd");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dt));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }
    public static Date dateStrToDate(String type,int increment,String date_str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }
    public static Date dateStrToDate(String type,int increment, String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("yy"))
                c.add(Calendar.YEAR, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MONTH, increment);
            else if(type.equals("dd"))
                c.add(Calendar.DAY_OF_MONTH, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }

    /////////////////////////////////////Time///////////////////////////////////////////////
    public static String timeStrToStr(String type,int increment) {
        try {
            String dt = CurrentDT.toStr("HH:mm:ss");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dt));
            if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);

            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String timeStrToStr(String type,int increment,String date_str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }
    public static String timeStrToStr(String type,int increment, String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return sdf.format(c.getTime());
        }catch(Exception ex){
            return null;
        }
    }

    /**
     *
     */
    public static Date timeStrToDate(String type,int increment) {
        try {
            String dt = CurrentDT.toStr("HH:mm:ss");
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(dt));
            if(type.equals("hh"))
            c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }
    public static Date timeStrToDate(String type,int increment,String date_str) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }
    public static Date timeStrToDate(String type,int increment, String date_str, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Calendar c = Calendar.getInstance();
            c.setTime(sdf.parse(date_str));
            if(type.equals("hh"))
                c.add(Calendar.HOUR_OF_DAY, increment);
            else if(type.equals("mm"))
                c.add(Calendar.MINUTE, increment);
            else if(type.equals("ss"))
                c.add(Calendar.SECOND, increment);
            return c.getTime();
        }catch(Exception ex){
            return null;
        }
    }
}
