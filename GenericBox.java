package com.skilmea.java.generics;

public class GenericBox<P> {
      private P object;
   
      public P getObject() {
            return object;
      }
      public void addObject(P object) {
            this.object = object;
      }

      public static void main(String[] args) {
            GenericBox<String> stringGenericBox = new GenericBox<>();
            stringGenericBox.addObject("Ja som String GenericBox Object.");
            String genericBoxString = stringGenericBox.getObject();            

            GenericBox<Integer> intGenericBox = new GenericBox<>();
            intGenericBox.addObject(Integer.MAX_VALUE);
            Integer i = intGenericBox.getObject();

            System.out.println(genericBoxString+" | a ja som inGenericBox Object : "+i);
      }
      
}
