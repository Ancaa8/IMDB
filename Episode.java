package org.example;
public class Episode {
    private String title;
    private Integer duration;
    public Episode(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {

        return title;
    }

    public int getDuration() {

        return duration;
    }

    public void displayInfo() { //asta nu stiu daca trebuie
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
    }
}
