package nl.novi.jp.methods.junior;

/**
 * Deze klasse is helemaal leeg, je mag nu dus alles zelf doen.
 * Maak een methode die een String ontvangt en deze in HOOFDLETTERS uitprint.
 * Bedenk zelf een goede Engelse naam voor de methode.
 *
 * Hoe maak je hoofdletters van een String in Java?
 * https://duckduckgo.com/?q=java+to+uppercase
 */

public class JuniorFive {
    public static void main(String[] args) {
        System.out.println(capatilize("allcaps"));
    }

    public static String capatilize(String string){
        String newString = string.toUpperCase();

        return newString;
    }
}
