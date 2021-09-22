/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


enum Boja { CRNA, PLAVA, CRVENA, BIJELA }

/**
 *
 * @author Korisnik
 */
public class AutoEnum {
    private String model;
    private String tip;
    private String marka;
    private int kubikaza;
    private Boja boja;

    public AutoEnum(String model, String marka, int kubikaza, Boja boja) {
        this.model = model;
        this.marka = marka;
        this.kubikaza = kubikaza;
        this.boja = boja;
    }

    @Override
    public String toString() {
        return "Model " + model + "\n" +
               "Tip " + tip + "\n" +
               "Marka " + marka + "\n" +
               "Zapremina " + kubikaza + "\n" +
               "Boja " + boja + "\n";
    }

}
