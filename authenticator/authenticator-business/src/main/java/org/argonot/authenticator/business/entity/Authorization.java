/* This software is the exclusive property of Argonot.
 * © Argonot.fr 2015 - All rights reserved */

package org.argonot.authenticator.business.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * <b>Authorization</b> give an access to a user to an application with specific role
 * @author Meidi
 *
 */
@Entity
@Table(name = "authorizations")
public class Authorization {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auth", unique = true, nullable = false)
    private long id;

    /**
     * User owning the authorization
     */
    @ManyToOne
    @JoinColumn(name="id_user")
    private User user;

    /**
     * Application concerned about the authorization
     */
    @ManyToOne
    @JoinColumn(name="AUID")
    private Application app;
    
    /**
     * User role for an app
     */
    @ManyToOne
    @JoinColumn(name="RUID")
    private Role role;
    
    /**
     * Default constructor
     */
    public Authorization() {
    }

    /**
     * Complete constructor
     * @param user : user authorized
     * @param app : application concerned
     * @param role : user permissions
     */
    public Authorization(User user, Application app, Role role) {
        this.user = user;
        this.app = app;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Application getApp() {
        return app;
    }

    public void setApp(Application app) {
        this.app = app;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
