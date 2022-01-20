package com.certification.chapter_8_class_design.this_or_super;

class Mammal {
    String type = "mammal";
}

public class Bat extends Mammal {
    String type = "bat";

    public String getType() {
        return super.type + ":" + this.type;
    }

    public static void main(String... zoo) {
        System.out.print(new Bat().getType());  //mammal:bat
    }

}