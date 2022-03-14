package entities.concretes;

import entities.abstracts.Entity;

public class User extends Entity {

    private String firstName;
    private String lastName;
    private int nationalId;
    private int yearOfBirth;

    public User() {
        super();
    }

    public User(int id, String gameName, String firstName, String lastName, int nationalId, int yearOfBirth) {
        super(id,gameName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}