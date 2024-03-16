package org.example;
import java.util.List;
public abstract class Production extends Entry implements Comparable<Object> {
    String title;
    List<String> directors;
    List<String> actors;
    List<Genre> genres;
    List<Rating> ratings;
    String description;
    double media;

    public Production(String title, List<String> directors, List<String> actors, List<Genre> genres, List<Rating> ratings, String description, double media) {
        this.title = title;
        this.directors = directors;
        this.actors = actors;
        this.genres = genres;
        this.ratings = ratings;
        this.description = description;
        this.media = mediaCalculator();
    }

    public String getTitle() {

        return title;
    }

    public List<String> getDirectors() {

        return directors;
    }

    public List<String> getActors() {

        return actors;
    }

    public List<Genre> getGenres() {

        return genres;
    }

    public List<Rating> getRatings() {

        return ratings;
    }

    public String getDescription() {

        return description;
    }

    public double getMedia() {

        return media;
    }
  double mediaCalculator() {
      if (ratings.isEmpty()) {
           return 0.0;
       }

       int sum = 0;
       for (int i = 0; i < ratings.size(); i++) {
            Rating rating = ratings.get(i);
            sum += rating.getScore(); // asta e implementata in Rating
        }
        return (double) sum / ratings.size();
    }

    public abstract void displayInfo();

    public int compareTo(Object o) {
            Production other = (Production) o;
            return this.title.compareTo(other.title);

    }
    public void addRating(Rating rating, User user) {
        //trb sa verific daca utilizatorul a evaluat deja producția
        if (user.getAccountType() != AccountType.Regular)
            return;
        // trb sa verific dacă utilizatorul are dreptul să adauge evaluare

        ratings.add(rating); //nu inteleg nu ar trb sa adaug score?
    }
    public Integer Evaluated(User user){
        return 0; //nu
    }




}
