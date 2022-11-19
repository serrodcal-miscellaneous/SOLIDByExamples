package com.serrodcal.solid.bad.interfaceSegregationPrinciple;

public class Bus implements Vehicle {

    @Override
    public void accelerate() {}

    @Override
    public void applyBrakes() {}

    @Override
    public void fly() {
        // dummy implementation
    }
    
}
