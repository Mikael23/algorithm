package com.training.demo.hibernate.oneToone;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Address {


    @Id
    @GeneratedValue(generator = "addressKeyGenerator")
    @GenericGenerator(
            name = "addressKeyGenerator",
            strategy = "foreign",
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "user")
    )
    protected Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column
    protected String street;

    @Column
    protected String city;


    @OneToOne(optional = false)
    @PrimaryKeyJoinColumn
    protected User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
