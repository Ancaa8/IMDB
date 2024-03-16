package org.example;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

abstract class Staff extends User implements StaffInterface {
   private List <Request> requests;
   private SortedSet <Entry> colectie;
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
    public Staff(Credentials credentials, String name, String country, int age, char gender, AccountType accountType)
    {
        super(credentials, name, country, age, gender, accountType);
        this.requests= new ArrayList<Request>();
        this.colectie = new TreeSet<Entry>();

    }
}
