package org.example;

import java.util.List;

public abstract class Movie extends Production{
    private Integer duration;
    private Integer year;


    public Movie(String title, List<String> directors, List<String> actors, List<Genre> genres, List<Rating> ratings, String description, double media, Integer duration, Integer year) {
        super(title, directors, actors, genres, ratings, description, media);
        this.duration = duration;
        this.year = year;
    }

    public Integer getDuration() {

        return duration;
    }

    public Integer getYear() {

        return year;
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

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Directors: " + directors);
        System.out.println("Actors: " + actors);
        System.out.println("Genres: " + genres);
        System.out.println("Rating: " + ratings);
        System.out.println("Rating: " + media);
        System.out.println("Description: " + description);
        System.out.println("Year: " + year);
        System.out.println("Duration: " + duration);
    }

    public int compareTo(Object o) {
        Movie other = (Movie) o;
        return this.title.compareTo(other.title);
    }

}
