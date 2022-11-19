package com.serrodcal.solid.good.interfaceSegregationPrinciple;

public class Aeroplane implements Vehicle, Flyable {

    @Override
    public void fly() {}

    @Override
    public void accelerate() {}

    @Override
    public void applyBrakes() {}
    
}
