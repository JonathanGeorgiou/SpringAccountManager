package com.qa.accountmanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;

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
    private long accountNumber;
    private int winnings;

    public Users() {
    }


    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Users(String firstName, String lastName, long accountNumber, int winnings) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.winnings = winnings;
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


    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getWinnings() {
        return this.winnings;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }
  
}