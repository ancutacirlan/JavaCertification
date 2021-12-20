package com.certification;

public class Main {

    public static void main(String[] args) {
        String month = "monday";
        switch ("friday") {
            default:
                System.out.println("Different day");
            case "monday": {
                System.out.println("First day at work");
                System.out.println("First day at work 2");
                break;
            }
            case "friday":
                System.out.println("Last day - friday");
                System.out.println("Last day at work");

        }


        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");


        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch(instrument) {
            case "bass" : break;
            case CELLO : p++;
            default: p++;
            case "VIOLIN": p++;
            case "viola" : ++p; break;
        }
        System.out.print(p);


    }
}
