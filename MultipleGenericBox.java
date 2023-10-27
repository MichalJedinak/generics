package com.skilmea.java.generics;

public class MultipleGenericBox<P,U> {
      private  P object_1;
      private  U object_2;
      public void add(P object_1 ,U object_2){
            this.object_1 = object_1;
            this.object_2 = object_2;
      }

      public static void main(String[] args) {
            MultipleGenericBox<String,Integer> jano= new MultipleGenericBox<>();           
            jano.add("Prvý objekt String jano",33);
      }
      
}
