package org.example;
abstract public class Contributor extends Staff implements RequestsManager {

   public Contributor(Credentials credentials, String name, String country, int age, char gender, AccountType accountType) {
        super(credentials, name, country, age, gender, accountType);
    }

      public  void addRequest(Request request){

      }
       public  void removeRequest(Request request){

       }
}
