//  pomocná trieda pre DoubleBox kôli funkcií  public Pair<T, P> getOutCompletBox() 
package com.skilmea.java.generics.uloha;

public class Pair<T, P> {
      private T t1;
      private P t2;
 
      public Pair(T t1, P t2) {
            this.t1 = t1;
            this.t2 = t2;
      }
      public T getT1() {
            return t1;
      }
      public void setT1(T t1) {
            this.t1 = t1;
      }
      public P getT2() {
            return t2;
      }
      public void setT2(P t2) {
            this.t2 = t2;
      }

      public static void main(String[] args) {
            Pair<Integer, String> pair  = new Pair<>(33," To je pekné ale čo s tým?");
            System.out.println(pair.getT1());
            System.out.println(pair.getT2());
      }

}
