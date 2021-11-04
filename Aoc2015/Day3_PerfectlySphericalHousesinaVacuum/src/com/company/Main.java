package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line= sc.nextLine();
        Set<String> hash_Set = new HashSet<>();
        Set<String> hash_Set2 = new HashSet<>();
        Integer x1=0;
        Integer y1=0;
        Integer x2=0;
        Integer y2=0;
        int co=0;

        for (char c:line.toCharArray()){

            hash_Set2.add(x2.toString() + y2.toString());
           if (co%2 == 0) {
               switch (c) {
                   case '^':
                       y1 += 1;
                       break;
                   case 'v':
                       y1 -= 1;
                       break;
                   case '>':
                       x1 += 1;
                       break;
                   case '<':
                       x1 -= 1;
                       break;
               }
               hash_Set.add(x1.toString() + y1.toString());

           }
           else  {
                switch (c) {
                    case '^':
                        y2 += 1;
                        break;
                    case 'v':
                        y2 -= 1;
                        break;
                    case '>':
                        x2 += 1;
                        break;
                    case '<':
                        x2 -= 1;
                        break;
                }
               hash_Set2.add(x2.toString() + y2.toString());
            }

           co++;
        }

            hash_Set.addAll(hash_Set2);
            System.out.println(hash_Set.size());

    }
}
