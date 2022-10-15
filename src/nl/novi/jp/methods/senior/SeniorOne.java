package nl.novi.jp.methods.senior;

import java.util.ArrayList;
import java.util.List;




/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class SeniorOne {
    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        fixCaps(customerNames);
    }

    public static void fixCaps(List<String> nameList){
        for (int i = 0; i < nameList.size(); i++) {

            String name = nameList.get(i);
            name = name.substring(0,1).toUpperCase() + name.substring(1);
            String firstName = "";
            String lastName = "";
            String rest = "";

            if(name.contains(" ")){
                firstName = name.split(" ")[0];
                rest = name.split(" ")[1];

                if(rest.contains(" ")|| rest.contains("-")){

                    if(rest.contains(" ")){
                        rest = rest.split(" ")[1];
                        lastName = rest.split(" ")[0];
                        lastName = "There is a space.";
                    }

                    if(rest.contains("-")){
                        rest = rest.split("-")[1];
                        lastName = rest.split("-")[0];
                        lastName = "There is a dash.";
                    }

                }else{
                    lastName = rest.substring(0,1).toUpperCase() + rest.substring(1);
                }
                nameList.set(i, firstName + " " + lastName);
            }
        }

        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
