/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korisnik
 */
public class AutoTest {
    public static void main(String[] args) {
        Auto bijeliAuto = new Auto("Ford", "Focus", "tip", 1900, "BIJELA");
        Auto crveniAuto = new Auto("Fiat", "Punto", "nekidrugi", 1200, "CRVENA");
        Auto plaviAuto = new Auto("Ford", "T", "T", 100, "PLAVA");
        Auto crniAuto = new Auto("Nissan", "Primera", "erfp", 100, "CRNA");
        Auto zutiAuto = new Auto("VW", "Golf", "rrfdsp", 300, "ZUTA");

        System.out.println(bijeliAuto);
        System.out.println(crveniAuto);
        System.out.println(plaviAuto);
        System.out.println(crniAuto);
        System.out.println(zutiAuto);


    }
}
