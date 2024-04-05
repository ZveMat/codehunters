package hu.codehunters;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        CustomString string1 = new CustomString("almafa".toCharArray());
        CustomString string2 = string1.replace('f', 'r');
        CustomString string3 = string1.concat(string2);
        CustomString string4 = string1.toUppercase();
        System.out.println("első: " + String.valueOf(string1.getSzoveg()));
        System.out.println("második: " + String.valueOf(string2.getSzoveg()));
        System.out.println("harmadik: " + String.valueOf(string3.getSzoveg()));
        System.out.println("negyedik: " + String.valueOf(string4.getSzoveg()));

    }
}