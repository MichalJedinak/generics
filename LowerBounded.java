package com.skilmea.java.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBounded {
      
      public static void   addInteger(List<? super Integer>list){
            int i = ( int ) (Math.random()*10);
            list.add(i);
            System.out.println(i);
            
      }
      public static void   addDouble(List<? super Double>list){
            double i = ( int ) (Math.random()*10);
            list.add(i);
            System.out.println(i);            
      }
      public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
             addInteger(list);addInteger(list);addInteger(list);addInteger(list);addInteger(list);
            
             List<Double> dList = new ArrayList<>();
             addDouble(dList);addDouble(dList);addDouble(dList);addDouble(dList);addDouble(dList);
      }
}
