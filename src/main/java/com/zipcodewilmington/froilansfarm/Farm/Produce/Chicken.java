package com.zipcodewilmington.froilansfarm.Farm.Produce;

import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Produce.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Generic.Animal;

public class Chicken extends Animal implements Produce {
    private Boolean isFertilized;

    public EdibleEgg yield(){
        return new EdibleEgg();
    }

    public void eat(Edible thingToEat) {

    }

    public void makeNoise() {

    }
}
