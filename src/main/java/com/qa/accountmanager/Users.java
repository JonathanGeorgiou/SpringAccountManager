package com.qa.accountmanager;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.GeneratedValue;

/**
 * Users
 */

@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private int winnings;

    public Users() {
    }

    

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Users(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
      
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getWinnings() {
        return this.winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }

}
