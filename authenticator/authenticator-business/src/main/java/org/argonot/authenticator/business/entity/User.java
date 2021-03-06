/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.authenticator.business.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * <b>User</b> stand for the relevant informations about an Argonot user / member
 * @author Meidi
 *
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * Unique User Identifier
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", unique = true, nullable = false)
    private long id;

    /**
     * User's name
     */
    @Column(nullable=false)
    private String name;

    /**
     * User's surname
     */
    @Column(nullable=false)
    private String surname;

    /**
     * User Argonot email
     */
    @Column(unique = true, nullable=false)
    private String email;

    /**
     * User password
     */
    @Column(nullable=false)
    private String password;
    
    /**
     * User avatar
     */
    @Column(nullable = true)
    private String avatar;

    /**
     * Authentication tries
     */
    @Column
    private int tries = 0;
    
    /**
     * Locked
     */
    @Column
    private boolean locked = false;

    /**
     * Users authorizations
     */
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnore
    private Set<Authorization> authorizations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Authorization> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(Set<Authorization> authorizations) {
        this.authorizations = authorizations;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    
}
