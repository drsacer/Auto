/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class Auto {
    private String model;
    private String tip;
    private String marka;
    private int kubikaza;
    private String boja;

    public Auto(String marka, String model, String tip,
            int kubikaza, String boja) {
        if (!setBoja(boja))
            System.out.println("Boja nije postavljena");
        else
            System.out.println("Boja je postavljena na " + this.boja);
        this.model = model;
        this.tip = tip;
        this.kubikaza = kubikaza;
        this.marka = marka;
    }

    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Model " + model + "\n" +
               "Tip " + tip + "\n" +
               "Marka " + marka + "\n" +
               "Zapremina " + kubikaza + "\n" +
               "Boja " + boja + "\n";
    }

    public boolean setBoja(String boja) {
        if (boja.compareTo("BIJELA") == 0 ||
            boja.compareTo("PLAVA") == 0 ||
            boja.compareTo("CRVENA") == 0 ||
            boja.compareTo("CRNA") == 0
        ) {
            this.boja = boja;
            return true;
        }
        this.boja = "default";
        return false;

    }

    


}
