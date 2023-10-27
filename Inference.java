package com.skilmea.java.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inference {
      static <T> T pick (T a1, T b2){  return a1; }
      public static void main(String[] args) {
            Serializable s=     pick(33, new ArrayList<String>());//  kľudne to môže byť aj Object nielen seraializable
            System.out.println(s);
            HashMap<String, List<String> > list = new HashMap<String,List<String>>();
            HashMap<String, List<String> > list1 = new HashMap<>();
            System.out.println(list);System.out.println(list1);
      }
}
