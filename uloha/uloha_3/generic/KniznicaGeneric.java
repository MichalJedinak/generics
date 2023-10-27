package com.skilmea.java.generics.uloha.uloha_3.generic;

import com.skilmea.java.generics.uloha.uloha_3.objects.Audio;
import com.skilmea.java.generics.uloha.uloha_3.objects.Kniha;
import com.skilmea.java.generics.uloha.uloha_3.objects.Video;

public class KniznicaGeneric<T> {
      private T item;

      public KniznicaGeneric(T item) {
            this.item = item;
      }
      public T getItem() {
            return item;
      }
      public void setItem(T item) {
            this.item = item;
      }
      public static void main(String[] args) {
            
           // Kniha k = new Kniha("Klokan Tom", "Joachim Klein", 78);
            Video v = new Video("Policajt na úteku","Christhoper Nolan");
            Audio a = new Audio("When Humanity Daying ","Protest");

            KniznicaGeneric<Kniha> bookLibrary = new KniznicaGeneric<>(new Kniha("The Catcher in the Rye", "J.D. Salinger", 3214));
             Kniha kniha =bookLibrary.getItem();
            System.out.println("Book: " + kniha.getTitle()+ " Autor : " +kniha.getAuthor() + " s počtom strán: " + kniha.getPages());

            KniznicaGeneric<Audio> audioLibrary = new KniznicaGeneric<>(a);
            Audio audio = audioLibrary.getItem();
            System.out.println("Cd: " + audio.getTitle() + " Autor : " + audio.getAuthor());
      
            KniznicaGeneric<Video> videoLibrary = new KniznicaGeneric<>(v);
            Video video = videoLibrary.getItem();
            System.out.println("Video: " + video.getTitle() + " Réžia : " + video.getAuthor());
      }
}
