package org.example;

import org.jetbrains.annotations.NotNull;

public abstract class Admin extends Staff {

    public Admin(Credentials credentials, String name, String country, int age, char gender, AccountType accountType){
        super(credentials, name, country, age, gender, accountType);
    }

    @Override
    void addToFavorites(MediaEntity favorite) {

    }


    @Override
    void removeFromFavorites(MediaEntity favorite) {

    }


    public void addProductionSystem(Production p){

    }
    public void addActorSystem(Actor a){

    }
    public void removeProductionSystem(String name){

    }
    public void removeActorSystem(String name){

    }
    public void updateProduction(Production p){

    }
    public void updateActor(Actor a){

    }


}
