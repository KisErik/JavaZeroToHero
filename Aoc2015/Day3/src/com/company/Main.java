package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        char[] locations="".toCharArray();
        try {
            FileReader fileReader=new FileReader("input.txt");
            Scanner sc = new Scanner(fileReader);
            locations= sc.nextLine().toCharArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Integer[] yxLocArray= new Integer[2];
        yxLocArray[0]=0;
        yxLocArray[1]=0;

        List<Integer> xyLoc=new ArrayList<>();
        xyLoc.add(0);
        xyLoc.add(0);

        int x=0;
        int y=0;



        Set<String> validLoc= new HashSet<>();
        validLoc.add(""+x+y);

        Set<String> validLoc2= new HashSet<>();

        int e=0;
        for(char c : locations)
        {


            switch (c)
            {
                case '^': xyLoc.set(1,xyLoc.get(1)+1);
                    yxLocArray[1]+=1;
                    y++;
                    e++;
                    break;
                case 'v': xyLoc.set(1,xyLoc.get(1)-1);
                    yxLocArray[1]-=1;
                    y--;
                    e++;
                    break;
                case '>': xyLoc.set(0,xyLoc.get(0)+1);
                    yxLocArray[0]+=1;
                    x++;
                    e++;
                    break;
                case '<': xyLoc.set(0,xyLoc.get(0)-1);
                    yxLocArray[0]-=1;
                    x--;
                    e++;
                    break;

            }


            validLoc.add(""+x+y);
        }

        int santaX=0,santaY=0,roboX=0,roboY=0;
        validLoc2.add(""+santaX+" "+santaY);
        boolean santaFlag=true;
        for(char c : locations)
        {

            switch (c) {
                case '^':if (santaFlag){
                            santaY += 1;
                            santaFlag = false;
                         }
                         else {
                             roboY += 1;
                             santaFlag = true;
                         }
                    break;
                case 'v':if (santaFlag){
                            santaY -= 1;
                            santaFlag = false;
                         }
                         else {
                            roboY -= 1;
                            santaFlag = true;
                         }
                    break;
                case '>':if (santaFlag){
                            santaX += 1;
                            santaFlag = false;
                        }
                        else {
                            roboX += 1;
                            santaFlag = true;
                        }
                    break;
                case '<':if (santaFlag){
                            santaX -= 1;
                            santaFlag = false;
                        }
                        else {
                            roboX -= 1;
                            santaFlag = true;
                        }
                    break;

            }
            if (santaFlag){
                validLoc2.add(""+roboX+" "+roboY);
            }
            else {
                validLoc2.add(""+santaX+" "+santaY);
            }
        }
        System.out.println(e);
        System.out.println(locations.length);
        System.out.println(validLoc.size());
        System.out.println(validLoc2.size());
        System.out.println(validLoc2.toString());


    }
}
