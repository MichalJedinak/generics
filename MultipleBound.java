package com.skilmea.java.generics;

import java.io.Serializable;

import objects.OtherDogSerializable;
import objects.Pes;

public class MultipleBound<P extends Pes & Serializable> {
      private P object;

      public static void main(String[] args) {
            MultipleBound<OtherDogSerializable> multipleBound = new MultipleBound<>();
            multipleBound.setObject(new OtherDogSerializable("Jonatán"));

            OtherDogSerializable jony = new OtherDogSerializable();
            jony.setName("Jonatán");
            jony.stekaj();
            // OtherDogSerializable pufy = new OtherDogSerializable("Pufy");
            // pufy.setName("Pufy");
            // pufy.stekaj();
      }

      public P getObject() {
            return object;
      }
      public void setObject(P object) {
            this.object = object;
      }
}
