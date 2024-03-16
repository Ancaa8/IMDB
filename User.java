package org.example;
import java.util.*;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public abstract class User implements Comparable<Any> {
    public AccountType getAccountType() {
        return accountType;
    }

    public class Information {
        Credentials credentials;
        String name;
        String country;
        int age;
        char gender;
        LocalDateTime birthDate;

        public Information(Credentials credentials, String name, String country, int age, char gender, LocalDateTime birthDate) {
            this.credentials = credentials;
            this.name = name;
            this.country = country;
            this.age = age;
            this.gender = gender;
            this.birthDate = birthDate;
        }
        public Credentials getCredentials() {
            return credentials;
        }

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public int getAge() {
            return age;
        }

        public char getGender() {
            return gender;
        }

        public LocalDateTime getBirthDate() {
            return birthDate;
        }
    }
    Information information;
    AccountType accountType;
    String username;
    String password;
    int experience;
    List<String> notifications;


    public SortedSet<Comparable<Any>> favorites = new TreeSet<>();//in loc de Any tre sa fie T?
    List<Production> ratedProductions = new ArrayList<Production>();
    Map<Production, String> deletedRatings = new HashMap<Production, String>();

    public User(Credentials credentials, String name, String country, int age, char gender, AccountType accountType) {
        this.information = new Information(credentials, name, country, age, gender, LocalDateTime.now());
        this.username = generateUsername(information);
        this.password = generatePassword();
        this.experience = 0;
        this.notifications = new ArrayList<>();
        this.favorites = new TreeSet<>();
        this.accountType = accountType;
    }
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public SortedSet<Comparable<Any>> getFavoriteMovies() {
        return favorites;
    } //in loc de Any tre sa fie T

    abstract void addToFavorites(MediaEntity favorite);

    abstract void removeFromFavorites(MediaEntity favorite);


    public void addExperience(Integer points, Production production) {
        if (accountType == AccountType.Regular && !isRatingDeleted(production) && !alreadyRated(production)){
            experience = experience + points; //nu pricep aici e facut cu chatul cum pot face altfel
        }
        else if(accountType == AccountType.Contributor)
            experience = experience + points;
        else{}

    }
    //sunt confuza legat de tot ce inseamna adaugare de experienta
    public void logoutAndReturn() {
        // nuj
    }

    public String generateUsername(Information information) {
        String ret = "";
        Random numar = new Random();
        String[] separate = information.getName().split(" ");

        for (String i : separate) {
            ret += i.toLowerCase() + "_";
        }
        int numar3cifre = numar.nextInt(900) + 100;
        ret += numar3cifre;
        return ret;
    }

    public String generatePassword() {
        Random random = new Random();
        String randomString = "";

        for (int i = 0; i < 3; i++) {
            char randomCharlow = (char) (random.nextInt(26) + 'a');
            char randomCharup = (char) (random.nextInt(26) + 'A');
            char randomCharspecialcharacter = (char) (random.nextInt(32) + '!');
            char randomChardigit = (char) (random.nextInt(10) + '0');
            randomString += randomCharlow;
            randomString += randomCharup;
            randomString += randomCharspecialcharacter;
            randomString += randomChardigit;
        }
        return randomString;
    }
    public int compareTo(Any any) {
//        return Integer.compare(this.experience, any.experience);
        return 0; //sterge asta
    }

    public void addRatedProduction(Production production) {
        ratedProductions.add(production);
    }
    public boolean alreadyRated(Production production) {
        return ratedProductions.contains(production);
    }
    public void addDeletedRating(Production production, String username) {
        deletedRatings.put(production, username);
    }
    public boolean isRatingDeleted(Production production) {
        return deletedRatings.containsKey(production);
    }
}
//// sunt extrem de confuza la niste chestii din observatii si legaturile cu clasa Regular
////clasa interna Information se face cu patternul Builder nu inteleg ce i aia
////mai e ceva de data la Information