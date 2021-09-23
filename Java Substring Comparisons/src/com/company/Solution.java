package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> strArray = new ArrayList<String>();
        for (int i = 0; i < s.length() - k+1; i++) {
            strArray.add(s.substring(i, i + k));
            //System.out.println(s.substring(i, i + k));

        }

        Collections.sort(strArray);
        smallest = strArray.get(0);
        largest = strArray.get(strArray.size()-1);

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest2(String s, int k) {
        String smallest = s.substring(0, 0 + k);
        String largest = s.substring(0, 0 + k);;

        for (int i = 1; i < s.length() - k+1; i++) {
            if (s.substring(i,i+k).compareTo(smallest)<0) smallest=s.substring(i,i+k);
            if (s.substring(i,i+k).compareTo(largest)>0) largest=s.substring(i,i+k);

        }



        return smallest + "\n" + largest;
    }
}
