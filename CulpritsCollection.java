/*
* This application is designed to output the
* list of corrupt Philippine govt officials
* once the user entered the name of the
* official it will output his or her position
* and the money that was stolen.
* Created by lbabay on 6/18/2017.
*/

public class CulpritsCollection {

    public static Culprits getCulprits(String kurakoteers) {

        Culprits culprits = new Culprits();

        culprits.setName(kurakoteers);

        if (kurakoteers.equalsIgnoreCase("noynoy")) {
            culprits.setPosition("President of the republic");
            culprits.setPocketedMoney(100000000);
        } else if (kurakoteers.equalsIgnoreCase("laila")) {
            culprits.setPosition("Senator");
            culprits.setPocketedMoney(100000000);
        } else if (kurakoteers.equalsIgnoreCase("erap")) {
            culprits.setPosition("Mayor of Manila");
            culprits.setPocketedMoney(80000000);
        } else if (kurakoteers.equalsIgnoreCase("Bong")) {
            culprits.setPosition("Senator");
            culprits.setPocketedMoney(20000000);
        } else if (kurakoteers.equalsIgnoreCase("jinggoy")) {
            culprits.setPosition("Senator");
            culprits.setPocketedMoney(5000000);
        }
        return culprits;
    }
}

