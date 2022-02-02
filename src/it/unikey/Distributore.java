package it.unikey;

import java.util.Scanner;

public class Distributore {

    private double deposito;
    private double euroPerLitroBenzina;
    private double euroPerLitroGasolio;

    public Distributore(double euroPerLitroBenzina, double euroPerLitroGasolio) {
        this.deposito = 0;
        this.euroPerLitroBenzina = euroPerLitroBenzina;
        this.euroPerLitroGasolio = euroPerLitroGasolio;
    }

    public void rifornisci(double rifornimento) {
        deposito += rifornimento;
    }

    public void rifornisci(Automobile auto) {
        System.out.println("Dimmi quanto hai pagato: ");
        Scanner pagamento = new Scanner(System.in);
        vendi(pagamento.nextDouble(), auto);
    }

    public void vendi(double pagato, Automobile auto) {
        if (auto.getAlimentazione().equals("Verde")) {
            deposito -= pagato / euroPerLitroBenzina;

        } else if (auto.getAlimentazione().equals("Gasolio")) {
            deposito -= pagato/euroPerLitroGasolio;
        } else {
            System.out.println("Tipo alimentazione non riconosciuto");
        }
        System.out.println("Nel deposito sono rimasti: " + deposito + " litri di carburante");
    }

    public void aggiorna(double euroPerLitro, String tipoAlimentazione) {
        if(tipoAlimentazione.equalsIgnoreCase("verde")) {
            euroPerLitroBenzina = euroPerLitro;
        } else if (tipoAlimentazione.equalsIgnoreCase("gasolio")) {
            euroPerLitroGasolio = euroPerLitro;
        } else {
            System.out.println("Non vendiamo questo tipo di carburante");
        }
    }
}

