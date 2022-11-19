package com.serrodcal.solid.good.dependencyInversionPrinciple;

public class Service {
    
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void save() {
        repository.save();
    }

}
