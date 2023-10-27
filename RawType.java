package com.skilmea.java.generics;

import java.util.ArrayList;
import java.util.List;

public class RawType {

      public static void main(String[] args) {
            
            GenericBox<String> genericBox = new GenericBox<>();
            GenericBox rawBox;
      
            List list = new ArrayList();
            list.add("Meno");
            list.add("Priezvysko");
            list.add(false);
      
            for(Object o :list){
                  String n = (String)o;
                  System.out.println(n);
            }
      }
      
      
}
