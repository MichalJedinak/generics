package com.skilmea.java.generics.uloha.uloha_3.objects;

import com.skilmea.java.generics.uloha.uloha_3.objects.inteface.KnihaImpl;

public class Kniha extends Medium implements KnihaImpl{

      private Integer pages  ;   
      public Kniha(String title, String author,Integer pages) {
            super(title, author);
            this.pages= pages;
          
      }
      public Integer getPages() {
            return pages;
      }
      public void setPages(Integer pages) {
            this.pages = pages;
      }
      
      @Override
      public void knihaJeSpapiera(String title) {
            Kniha kniha = new Kniha(title, title, pages);
            kniha.setTitle("Kniha o prírode");
            kniha.getTitle();
            System.out.println(title+ " :  je z paiera a má Obal .");
      }
      
      @Override
      public void knihaSaDaCitat(String title) {
            Kniha kniha = new Kniha(title, title, pages);
            kniha.setTitle(title);
            kniha.getTitle();
            System.out.println(title+" : sa dá čítať pretože má písmená ktoré to umožňujú .");;
      }
      public String getTitle() {
            return title;
      }
      public void setTitle(String title) {
            this.title = title;
      }
      @Override
      public void numbersOfPages(String title,Integer available) {
            Kniha kniha = new Kniha(title, title, available);
            kniha.setPages(available);   
            System.out.println("Ppočet strán v knihe "+title+" je :"+available);;
         
      }
      @Override
      public void kniha(String title, String author, Integer available) {
            Kniha kniha = new Kniha(author, author, available);
            kniha.setTitle(title);kniha.setAuthor(author);kniha.setPages(available);
            System.out.println("Kniha : "+kniha.getTitle()+" "+kniha.getAuthor()+" "+kniha.getPages());
      }
      
}
