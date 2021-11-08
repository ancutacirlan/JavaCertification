package tests;

 public class PoliceBox {

    String color;

    long age;

    public void PoliceBox() {

        color = "blue";
        age = 1200;
    }
    public static void main(String []time) {
        var p = new PoliceBox();

        var q = new PoliceBox();

        p.color = "green";

        p.age = 1400;

        p = q;

        System.out.println("Q1="+q.color);

        System.out.println("Q2="+q.age);

        System.out.println("P1="+p.color);

        System.out.println("P2="+p.age);
        
    } }

//
// public class WaterBottle {
//
//    private String brand;
//
//    private boolean empty;
//
//    public static float code;
//
//    public static void main(String[] args) {
//
//        WaterBottle wb = new WaterBottle();
//
//        System.out.println("Empty = " + wb.empty);
//
//        System.out.println("Brand = " + wb.brand);
//
//        System.out.println("Code = " + code);
//
//    } }

