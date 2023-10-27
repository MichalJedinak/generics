package com.skilmea.java.generics.uloha;

public class DoubleBox<T , P> {
      private T boxT;
      private P boxP;
      

      public DoubleBox() {
      }

      public DoubleBox(T boxT,P boxP) {
            this.boxT = null;
            this.boxP = null;
      }

      public  void   putInDoubleBox(T boxT,P boxP){
           this.boxT=boxT;
           this.boxP= boxP;
      }
    

      public T getOutOfBoxT() {
            return boxT;
      }
      public void putInBoxT(T boxT) {
            this.boxT = boxT;
      }
      public P getOutOfBoxP() {
            return boxP;
      }
      public void putInBoxP(P boxP) {
            this.boxP = boxP;
      }

      public Pair<T, P> getOutCompletBox() {
            System.out.println(new Pair<>(boxT,boxP));
            return new Pair<>(boxT,boxP);
        }

      public static void main(String[] args) {
            //  variables for the example
            Integer i = 70;           
            String s = "Sukien mala";  
            String p ="String s Pole S"; 
            Integer u = 2;
            
            //   variables i and s
            DoubleBox<Integer,String> doubleBox= new DoubleBox<>();
            doubleBox.putInBoxP(s);
            doubleBox.putInBoxT(i);
            System.out.println(doubleBox.getOutOfBoxT()+" "+ doubleBox.getOutOfBoxP());

            System.out.println("///////////////////////");
            // new variables for the example
            doubleBox.putInDoubleBox(20,"Polepším sa");
            doubleBox.getOutCompletBox();
            System.out.println("example first whith variables Integer and  String :"+doubleBox.getOutOfBoxT()+ " "+doubleBox.getOutOfBoxP().toUpperCase());

            System.out.println("//////////////////");
            /// variables p and u
            DoubleBox<String,Integer> doubleBox2 = new DoubleBox<>();
            doubleBox2.putInDoubleBox(p,u);
            System.out.println("example second whith variables String and Integer : " +doubleBox2.getOutOfBoxT().toUpperCase()+ " " + doubleBox2.getOutOfBoxP());

            DoubleBox<Character,String> dBox3= new DoubleBox<>();
            dBox3.putInDoubleBox('8',"Osem je Character");
            System.out.println("example treet whith variables Character and String : " +dBox3.getOutOfBoxT()+ " " + dBox3.getOutOfBoxP());
            dBox3.putInBoxP(p);
            dBox3.putInBoxT('S');
            System.out.println("example treet whith variables Character and String : " +dBox3.getOutOfBoxT()+ " " + dBox3.getOutOfBoxP());
      }     

}
