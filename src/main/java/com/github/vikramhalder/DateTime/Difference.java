package com.github.vikramhalder.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Difference {
    public static boolean leftIsBig(String left_date, String right_date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date from = sdf.parse(left_date);
            Date to = sdf.parse(right_date);
            if (from.compareTo(to) > 0) {
                return true;
            } else if (from.compareTo(to) < 0) {
                return false;
            } else if (from.compareTo(to) == 0) {
                return false;
            } else {
                return false;
            }
        }catch (Exception ex){
            return false;
        }
    }
    public static boolean leftIsBig(String left_date, String right_date,String format){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date from = sdf.parse(left_date);
            Date to = sdf.parse(right_date);
            if (from.compareTo(to) > 0) {
                return true;
            } else if (from.compareTo(to) < 0) {
                return false;
            } else if (from.compareTo(to) == 0) {
                return false;
            } else {
                return false;
            }
        }catch (Exception ex){
            return false;
        }
    }
}
