package org.example;
import java.util.List;
import java.util.Map;

public class Series extends Production{
    private Integer year;
    private Integer numberOfSeasons;
    private Map<String, List<Episode> > seasons;

    public Series(String title, List<String> directors, List<String> actors, List<Genre> genres, List<Rating> ratings, String description, double media, Integer year,
   Integer numberOfSeasons, Map<String, List<Episode> > seasons){

        super(title, directors, actors, genres, ratings, description, media);
        this.year = year;
        this.numberOfSeasons = numberOfSeasons;
        this.seasons = seasons;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public Map<String, List<Episode>> getSeasons() {
        return seasons;
    }
    public String getTitle() {
        return super.getTitle();
    }

    public List<String> getDirectors() {
        return super.getDirectors();
    }

    public List<String> getActors() {
        return super.getActors();
    }

    public List<Genre> getGenres() {
        return super.getGenres();
    }

    public List<Rating> getRatings() {
        return super.getRatings();
    }

    public String getDescription() {
        return super.getDescription();
    }

    public double getMedia() {
        return super.getMedia();
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Directors: " + directors);
        System.out.println("Actors: " + actors);
        System.out.println("Genres: " + genres);
        System.out.println("Rating: " + media);
        System.out.println("Description: " + description);
        System.out.println("Release Year: " + year);
        System.out.println("Number of Seasons: " + numberOfSeasons);

        for (Map.Entry<String, List<Episode>> entry : seasons.entrySet()) { // nu prea e clar
            String season = entry.getKey();
            List<Episode> episodes = entry.getValue();
            System.out.println("Season " + season + ":");
            for (Integer i = 0; i < episodes.size(); i++) {
                Episode episode = episodes.get(i);
                episode.displayInfo();
            }
        }
    }
    public int compareTo(Object o) {
        Series other = (Series) o;
        return this.title.compareTo(other.title);
    }

}




