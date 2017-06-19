/*
* This application is designed to output the
* list of corrupt Philippine govt officials
* once the user entered the name of the
* official it will output his or her position
* and the pocketed money.
* Created by lbabay on 6/18/2017.
*/

import java.text.NumberFormat;

public class Culprits {

    private String name;
    private String position;
    private long pocketedMoney;

    public Culprits() {
        this.name = name;
        this.position = position;
        this.pocketedMoney = pocketedMoney;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPocketedMoney(long pocketedMoney) {
        this.pocketedMoney = pocketedMoney;
    }

    public String getPosition() {
        return position;
    }

    public String getPocketedMoneyFormatted() {
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        String pocketedMoneyFormatted = dollars.format(pocketedMoney);
        return pocketedMoneyFormatted;
    }
}
