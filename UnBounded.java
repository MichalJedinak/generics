package com.skilmea.java.generics;

import java.util.HashMap;

public class UnBounded {
      public static void main(String[] args) {
      }

      public static void printMapp(HashMap<Long, ?> collection){
            for(Long key : collection.keySet()){
                  System.out.println(collection.get(key));
            }
      }

      public static <P> void printMappP(HashMap<Long, P> collection){
            for(Long key : collection.keySet()){
                  P p = collection.get(key);
                  collection.put(key, p);
                  System.out.println(collection.get(key));
            }
      }
}
