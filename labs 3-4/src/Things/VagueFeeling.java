package Things;

import AbstractClasss.ThingsOnTable;

public class VagueFeeling extends ThingsOnTable {
    public VagueFeeling(String name){
        super(name);
    }

    public void appear(){
        System.out.println(" У Малыша возникло " + this.name + " что ");
    }


}
