package it.unikey;

public class Automobile {
    private  String alimentazione;

    public Automobile(String alimentazione) {
        switch (alimentazione) {
            case "Verde":
                this.alimentazione = alimentazione;
                break;
            case "Gasolio":
                this.alimentazione = alimentazione;
                break;
            default:
                this.alimentazione = "Verde";
        }
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        if (alimentazione.equalsIgnoreCase("Verde") || alimentazione.equalsIgnoreCase("Gasolio")) {
            this.alimentazione = alimentazione;
        } else {
            System.out.println(alimentazione + ": non abbiamo ancora questa tecnologia!");
        }
    }
}
