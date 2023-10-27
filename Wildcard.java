package com.skilmea.java.generics;

import java.util.List;

public class Wildcard {

      //  upperbounded
      public static  double  sumarOfList(List<? extends Number>list){
            double d = 0.0;
            for(Number element : list){
                  d += element.doubleValue();
            }
            //Number n = list.get(3);
            //  list.add(n);  tot by nefungovalo  kedže  v upperboundet  sa iba vyberá 
            return d;
      }
      // lowerbounded
      public static void   addDouble(List<? super Double>list){
            double i = ( int ) (Math.random()*10);
            list.add(i);
            System.out.println(i);            
      }
}
