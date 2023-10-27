package com.skilmea.java.generics.uloha;

public class Krabicka <T> {
    
    private T krabicka;

    public Krabicka() {
        this.krabicka=null;
    }
    
    public T getOutOfBox() {
        return krabicka;
    }
    public void putInBox(T krabicka) {
        this.krabicka = krabicka;
    }

    public static void main(String[] args) {

        // Objekt  Integer 
        Krabicka<Integer> intBox = new Krabicka<>();
        int random = (int) (Math.random()*100) ;
        intBox.putInBox( 23+ random);
        System.out.println(random);
        int i = intBox.getOutOfBox();
        System.out.println("Integer s boxu krabička  je :" + i);

        // Objekt  Double 
        Krabicka<Double> doubleBox = new Krabicka<>();
        Double d = (Double)(Math.random()*10);
        doubleBox.putInBox(d);
        System.out.println(doubleBox.getOutOfBox()+ " "+ i);

        // Objekt String 
        Krabicka<String> stringBox = new Krabicka<>();
        String s = "Je najkrajšia :)";
        stringBox.putInBox("String box krabička "+s);
        String out = stringBox.getOutOfBox();
        System.out.println(out + " "+d+i);

    }

}
