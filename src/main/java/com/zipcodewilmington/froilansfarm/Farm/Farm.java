package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Farm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Farmhouse;
import com.zipcodewilmington.froilansfarm.Farm.Shelter.Stable;

import java.util.Collection;

public class Farm {
    Farmhouse fh;
    Collection<Stable> stables;
    Collection<ChickenCoop> chickenCoops;
    Collection<RefrigeratedFoodStorage> foodStorages;
    Collection<Field> fields;
}
