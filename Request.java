package org.example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Request {
    public enum RequestType { //de ce exista RequestType si RequestTypes
        DELETE_ACCOUNT, ACTOR_ISSUE, MOVIE_ISSUE, OTHERS
    }

    private RequestType type;
    private LocalDateTime creationDate;
    String title;
    String description;
    String creatorUsername;
    String solverUsername;
    Integer solved=0;



    public Request(RequestType type, LocalDateTime creationDate, String title, String description, String creatorUsername) {
        this.type = type;
        this.creationDate = LocalDateTime.now();
        this.title = title;
        this.description = description;
        this.creatorUsername = creatorUsername;
        this.solverUsername = Solver(solved);
    }
    public RequestType getType() {

        return type;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public String getTitle() {

        return title;
    }

    public String getDescription() {

        return description;
    }

    public String getCreatorUsername() {

        return creatorUsername;
    }

    public String getResolverUsername() {

        return solverUsername;
    }
    public String Date() {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return creationDate.format(date); // nici asta nu inteleg
    }
    public String Solver(Integer solved) {
        if (type == RequestType.DELETE_ACCOUNT || type == RequestType.OTHERS)
        {
            return "ADMIN";
        }
        else if(type == RequestType.ACTOR_ISSUE || type == RequestType.MOVIE_ISSUE)
        {
            return creatorUsername;
        }
        else
            return null;
    }
    public void Solve(Integer solved) {
        solved=1;
        notify(solved);
    }

    public void Reject(Integer solved) {
        solved=0;
        notify(solved);
    }

    public void notify(Integer solved) {
        if (solved==1)
            System.out.println("Cerere rezolvată");
        else
            System.out.println("Cerere respinsă");
    }

//trebuie sa adaug sau sa scot lucruri
    //nu cred ca e ok la solve si reject
}
