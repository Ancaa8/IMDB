package org.example;
public class Rating {
    private String username;
    private Integer score;
    private String comments;

    public Rating(String username, Integer score, String comments) {
        this.username = username;
        this.score = score;
        this.comments = comments;
    }

    public String getUsername() {

        return username;
    }
    public Integer getScore() {

        return score;
    }
    public String getComments() {

        return comments;
    }

}

