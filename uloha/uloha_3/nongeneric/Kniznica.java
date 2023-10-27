package com.skilmea.java.generics.uloha.uloha_3.nongeneric;

import com.skilmea.java.generics.uloha.uloha_3.objects.Audio;
import com.skilmea.java.generics.uloha.uloha_3.objects.Kniha;
import com.skilmea.java.generics.uloha.uloha_3.objects.Video;

public class Kniznica {

      public static void main(String[] args) {
            
            Kniha k = new Kniha("Klokan Tom", "Joachim Klein", 78);
            Video v = new Video("Policajt na úteku","Christhoper Nolan");
            Audio a = new Audio("When Humanity Daying ","Protest");
            
            //  overenie implementacie pre knihu
            Kniha kniha = new Kniha(null, null, null);
            kniha.knihaSaDaCitat("Národné pamiatky Slovenksa");
            kniha.knihaJeSpapiera("Ostrov Pokladov");
            kniha.setTitle("Lená víla");
            kniha.numbersOfPages(kniha.getTitle(),328);
            kniha.kniha("Mloky v akci", " Františk Ágh", 88);

            Kniznica kniznica = new Kniznica(k, a, v);
            System.out.println(kniznica.kniha.getTitle());
            System.out.println(kniznica.getKniha().getTitle());
            System.out.println(kniznica.getAudio().getTitle());
            System.out.println(kniznica.getVideo().getAuthor());
      }
      private final Kniha kniha;
      private final Audio audio;
      private final Video video;

      public Kniznica(Kniha kniha, Audio audio, Video video) {
            this.kniha = kniha;
            this.audio = audio;
            this.video = video;
      }

      public Kniha getKniha() {
            return kniha;
      }
      public Audio getAudio() {
            return audio;
      }
      public Video getVideo() {
            return video;
      }
}
