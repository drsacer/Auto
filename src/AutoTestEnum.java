/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class AutoTestEnum {
    public static void main(String[] args) {
        AutoEnum[] auti = {
            new AutoEnum("Skoda", "Octavia", 2000, Boja.CRVENA)
        };

        for (AutoEnum ae : auti) {
            System.out.println(ae);
        }
    }

}
