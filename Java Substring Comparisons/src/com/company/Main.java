package com.company;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import static com.company.Solution.getSmallestAndLargest;
import static com.company.Solution.getSmallestAndLargest2;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
        System.out.println(getSmallestAndLargest2(s, k));

 // 3.
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++){
            sets.add(s.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());

    }
}
