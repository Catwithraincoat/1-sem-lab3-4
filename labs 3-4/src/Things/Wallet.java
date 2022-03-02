package Things;

import AbstractClasss.ThingsOnTable;
import enums.Existance;

import static enums.Existance.LAYON;
import static enums.Existance.NOTLAYON;

public class Wallet extends ThingsOnTable { ;
    public Existance condition;

    public Wallet(String name){
        super(name);
    }


    public void layon(){
        condition = LAYON;
        System.out.println(this.name + ' ' + this.condition.label);

    }
    public void notlayon(){
        condition = NOTLAYON;
        System.out.println(this.name + ' ' + this.condition.label);
    }

}
