package com.skilmea.java.generics;

public class Box {
      private Object object ;

      public Object getObject() {
            return object;
      }
      public void addObject(Object object) {
            this.object = object;
      }

      public static void main(String[] args) {
            Box inteBox = new Box();
            inteBox.addObject("333");
            Integer i = (Integer) inteBox.getObject();         
            System.out.println(i);// ClassCastException  spadne to až po spustený programu 
      }
      
}
