package com.certification.chapter_8_class_design.this_or_super;

public class Lion extends Animal {
    public void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

//    public void roar() {
//        System.out.print("Lions age: "+age);  //age is private
//    }

    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says:Roar !");
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }

}