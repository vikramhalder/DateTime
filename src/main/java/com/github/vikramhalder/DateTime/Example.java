package com.github.vikramhalder.DateTime;

import com.github.vikramhalder.DateTime.DateFormatter.CurrentDT;
import com.github.vikramhalder.DateTime.DateFormatter.Difference;

public class Example {
    public static void main(String[] args){
        System.out.println(Difference.leftIsBig("2018-06-28 15","2018-06-28 13","yyyy-MM-dd HH"));
    }
}
