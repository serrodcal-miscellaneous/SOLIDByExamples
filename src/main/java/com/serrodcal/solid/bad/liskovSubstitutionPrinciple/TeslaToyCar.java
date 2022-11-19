package com.serrodcal.solid.bad.liskovSubstitutionPrinciple;

public class TeslaToyCar extends Car {
    
    @Override
    public void fuel() {
        throw new IllegalStateException("Not Supported");
    }

    @Override
    public void wheels() {}

    @Override
    public void run() {}

}
