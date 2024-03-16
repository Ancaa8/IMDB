package org.example;
import java.util.Map;

public class Actor extends Entry{
    public String name;
    public Map<Production,String> aparitii;
    public String biography;

    public Actor(String name, Map<Production, String> aparitii, String biography) {
        this.name = name;
        this.aparitii = aparitii;
        this.biography = biography;
    }
    public String getName() {
        return name;
    }

    public int compareTo(Actor other) {
        return this.getName().compareTo(other.getName()); //nuj
    }


}
