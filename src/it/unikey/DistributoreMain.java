package it.unikey;

public class DistributoreMain {

   public static void main (String[] args) {

      Distributore dis = new Distributore(1.67,1.50);
      Automobile auto = new Automobile("Carlo");
      auto.setAlimentazione("Mbare");
      System.out.println(auto.getAlimentazione());
      dis.rifornisci(300);
      dis.rifornisci(auto);
      dis.aggiorna(2.00, "Verde");
      dis.rifornisci(auto);
   }


}
