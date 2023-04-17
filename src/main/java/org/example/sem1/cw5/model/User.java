package org.example.sem1.cw5.model;

public class User {

    private Integer userID;
    private String firstName;
    private String secondName;
    private Double balance;

    public User(Integer userID, String firstName, String secondName, Double balance) {
        this.userID = userID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.balance = balance;
    }


    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
