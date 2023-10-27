package com.skilmea.java.generics;

import objects.OtherDog;
import objects.Pes;

public class BoundedType<P  extends Pes> {
    private   P objectDog;

      public P getObjectDog() {
            return objectDog;
      }
      public void setObjectDog(P objectDog) {
            this.objectDog = objectDog;
      }
      public void stekaj(){
            objectDog.stekaj();
      }

      public static void main(String[] args) {
            //// môže extendnúť aj sám seba teda object Pes extends object Pes alebo objekts ktoré extendujú psa
            BoundedType<OtherDog> newDog = new BoundedType<>();
            OtherDog otherDog = new OtherDog();
            otherDog.setName("Hafi");
            newDog.setObjectDog(otherDog);

            BoundedType<Pes> newDog2 = new BoundedType<>();
            Pes pes = new Pes();
            pes.setName("Dunčo");
            newDog2.setObjectDog(pes);

            newDog.stekaj();newDog2.stekaj();
            System.out.println(newDog.getObjectDog()+ " \n"+ newDog2.getObjectDog());

            newDog.setObjectDog(new OtherDog());
            newDog.stekaj();
      }
}
