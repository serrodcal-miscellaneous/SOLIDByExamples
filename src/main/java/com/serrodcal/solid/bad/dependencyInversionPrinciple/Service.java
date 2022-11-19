package com.serrodcal.solid.bad.dependencyInversionPrinciple;

public class Service {
    
    // Here we've hard-coded SQLRepository
    // in-future if we need to support NoSQLRepository
    // then we need to modify our code

    private SQLRepository repository = new SQLRepository();

    public void save() {
        repository.save();
    }

}
