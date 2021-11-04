package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int l;
        int w;
        int h;
        int total=0;
        int total2=0;
        String line = null;
        while (sc.hasNext() && !(line = sc.nextLine()).equals("exit")) {

            l=Integer.parseInt(line.split("x")[0]);
            w=Integer.parseInt(line.split("x")[1]);
            h=Integer.parseInt(line.split("x")[2]);

            int a=l*w;
            int b=l*h;
            int c=w*h;


            if (a <= b && a <=c) { total+=a; }
            else if(b <= a && b <=c ) { total+=b; }
            else { total+=c; }

            if (l >= w && l>=h){total2 += 2*h+2*w;}
            else if (w >= l && w>=h){total2 += 2*l+2*h;}
            else {total2 += 2*l+2*w;}

            total +=(2*a) + (2*b) + (2*c);
            total2 +=(l*w*h);



        }

        System.out.println("First:" + total);
        System.out.println("Second:" + total2);

    }
}
