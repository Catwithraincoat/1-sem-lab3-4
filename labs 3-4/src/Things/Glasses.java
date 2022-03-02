package Things;

import AbstractClasss.ThingsOnTable;
import enums.Existance;

import static enums.Existance.LAYON;
import static enums.Existance.NOTLAYON;

public class Glasses extends ThingsOnTable {
    public Existance condition;

    public Glasses(String name){
        super(name);
    }


    public void layon(){
        Existance condition = LAYON;
        System.out.println(this.name + ' ' + this.condition.label);

    }
    public void notlayon(){
        Existance condition = NOTLAYON;
        System.out.println(this.name + ' ' + this.condition.label);
    }
}
