package com.certification.chapter_8_class_design.top_level_inner_level;

public class Flamingo {
    private String color;
    private Integer nrLeg;
    private int nrEye;

    public void setColor(String color) {
        this.color = color; //PINK
        color = color; //null
    }

    public void setNrLeg(Integer numberOfLeg) {
        nrLeg = numberOfLeg;
    }

    public void setNrEye(int nrEye) {
         //nrEye =this.nrEye ; //0
         this.nrEye =nrEye ;
    }

    public static void main(String... unused) {
        Flamingo f = new Flamingo();
        f.setColor("PINK");
        System.out.println(f.color);
        f.setNrLeg(2);
        System.out.println(f.nrLeg);
        f.setNrEye(2);
        System.out.println(f.nrEye);
    }
}