package com.company;

public class StepCounter {

    //Part 1 solution
    public static int ActualFloor(String line){
        int floor=0;

        for (char a :line.toCharArray()){
            if (a=='('){ floor++;}
            if (a==')'){ floor--;}
        }

        return floor;
    }

    public static int BasmentEnterPos(String line){
        int floor=0;
        int counter=1;
        for (char a :line.toCharArray()){
            if (a=='('){ floor++;}
            if (a==')'){
                floor--;
                if(floor == -1){
                    return counter;
                }
            }
            counter++;


        }

        return counter;
    }




}
