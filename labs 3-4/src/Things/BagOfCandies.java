package Things;

import AbstractClasss.ThingsOnTable;
import Characters.UncleJulious;
import enums.Existance;

import static enums.Existance.LAYON;
import static enums.Existance.NOTLAYON;

public class BagOfCandies extends ThingsOnTable {
    public Existance condition;

    public BagOfCandies(String name){
        super(name);
    }
    public void NeedntSee(UncleJulious uncleJulious){
        System.out.println(uncleJulious.name + " незачем видеть "+ this.name);
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
