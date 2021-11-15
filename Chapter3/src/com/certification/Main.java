package com.certification;

public class Main {

    public static void main(String[] args) {

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); // 1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); // -1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); // -1.21

        int lion = 3;
        int tiger = ++lion * 5 / lion--; //  ++lion*5/3  -> 3*5/3   -> lion = 3
        System.out.println("lion is " + lion);  //3
        System.out.println("tiger is " + tiger); //5

        System.out.println(9 / 3); //3
        System.out.println(9 % 3); //0
        System.out.println(10 / 3); //3
        System.out.println(10 % 3); //1
        System.out.println(11 / 3); //3
        System.out.println(11 % 3); //2
        System.out.println(12 / 3); //4
        System.out.println(12 % 3); //0

        System.out.println(-9 / -4); //2
        System.out.println(-9 % -4); //-1

        //numeric promotion rules

        int x = 1;
        long y = 33;
        var z = x * y;
        System.out.println(z);

        double m = 39.21;
//        float u = 2.1; must add f -> is double , not float
//        var r =m+u;

        short p = 10;
        short t = 3;
        var u = p*t;
        System.out.println(u);

        short w = 14;
        float q = 13;
        double a = 30;
        var d = w * q / a;
        System.out.println(d);

        short mouse = 10;
        short hamster = 3;
//        short capybara = mouse * hamster; // mouse and hamster are converted at int, so capybara mst be int or add (short) cast
        short cap = (short)(mouse*hamster);
        System.out.println(cap);
        int capybara = mouse*hamster;
        System.out.print(capybara);


        long goat = 10;
        int sheep = 5;
        sheep*=goat;
        System.out.println(sheep);

        boolean healthy = false;
        if(healthy = true)
            System.out.println("Good!");


        //ternary operator
        int shp = 1;
        int zzz = 1;
        int slp = zzz<10 ? shp++ : zzz++;
        System.out.println(shp+","+zzz); // 2,1

        int sep = 1;
        int zzzz = 1;
        int sleep = sep>=10 ? sep++ : zzzz++;
        System.out.println(sep+","+zzzz); // 1,2

        long  aaa = 122222256l;
        int bbb = (int) a;
        System.out.println(bbb);
    }
}
