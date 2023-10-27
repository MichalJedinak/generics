package com.skilmea.java.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class GenerecsM {
      private static <T> ArrayList <T> preklopMapNaList(HashMap<Long,T>collection){
          ArrayList<T> arrayList = new ArrayList<>();
          for(Long key : collection.keySet()){
            arrayList.add(collection.get(key));
          }
            return arrayList;
      }

      public static void main(String[] args) {
            ArrayList<String> stringList = new ArrayList<>();
            LinkedHashMap<Long,String> stringLinkedHashMap = new LinkedHashMap<>();
            stringList = preklopMapNaList(stringLinkedHashMap);
            stringList = GenerecsM.preklopMapNaList(stringLinkedHashMap);
            System.out.println(stringList.toString());
      }
}
