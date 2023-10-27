package com.skilmea.java.generics.uloha.uloha_3.objects;

public class Medium {
      protected String title; 
      private String author;
 
      public Medium(String title, String author) {
            this.title = title;
            this.author = author;
      }

      public String getTitle() {
            return title;
      }
  
      public void setTitle(String title) {
            this.title = title;
      }
   
      public String getAuthor() {
            return author;
      }
 
      public void setAuthor(String author) {
            this.author = author;
      }
}
