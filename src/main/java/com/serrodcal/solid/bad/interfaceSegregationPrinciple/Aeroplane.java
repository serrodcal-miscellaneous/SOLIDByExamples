package com.serrodcal.solid.bad.interfaceSegregationPrinciple;

public class Aeroplane implements Vehicle {

    @Override
    public void accelerate() {}

    @Override
    public void applyBrakes() {}

    @Override
    public void fly() {}
    
}
