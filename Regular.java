package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


abstract public class Regular extends User implements RequestsManager {

    private List<Request> requests = new ArrayList<>();


    public Regular(Credentials credentials, String name, String country, int age, char gender, AccountType accountType) {
        super(credentials,name,country,age,gender,AccountType.Regular); //???
    }

    public void addRequest(Request request) {
        requests.add(request);
    }

    public void removeRequest(Request request) {
        requests.remove(request);
    }


    public void addRating(Production production, String username, int score, String comments) {
        if (!alreadyRated(production)) {
            Rating rating = new Rating(username, score, comments);
     //       production.addRating(rating.getScore());
            addRatedProduction(production);
        }
    }
    public void addToFavorites(User favorite) { //in loc de Any tre sa fie T
        favorites.add((Comparable<Any>) favorite);
    }

        public void removeFromFavorites(Any favorite) { //si aici
        favorites.remove(favorite);
    }

}

