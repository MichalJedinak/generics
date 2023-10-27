package com.skilmea.java.generics;

import java.util.Arrays;
import java.util.List;

public class UpperBounded {

      public static void main(String[] args){

            sumarZlistu(Arrays.asList(10,20,30,60,50,40,31));
            sumarOfList(Arrays.asList(11,33,99,66,100));
      }

      public static <P extends Number> double  sumarZlistu(List<P>list){
            double d = 0.0;
            for(P element : list){
                  d += element.doubleValue();
            }            
            P number = list.get(1);
            list.add(number);
            return d;
      }
      //// bounded wildcard  ?  namiesto klasickeho generika ako je T  alebo P  alebo Z 
      ///  uperboundet používame lenn vtey ak skolekcie iba vyťahujem a nič nevkladám!!!
      public static  double  sumarOfList(List<? extends Number>list){
            double d = 0.0;
            for(Number element : list){
                  d += element.doubleValue();
            }
            //Number n = list.get(3);
            //  list.add(n);  tot by nefungovalo  kedže  v upperboundet  sa iba vyberá 
            return d;
      }
}
