/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class BojaTest {
    public static void main(String[] args) {
        Boja b = Boja.CRVENA;

        System.out.println(b);
        System.out.println(b.name());
        System.out.println(b.ordinal());


        // Kako ispisati sve elemente enumeracije

        for (Boja bo : Boja.values()) {
            System.out.println(bo);
        }

        // Enum ne smije biti u tijelu metoda.

    }

}
