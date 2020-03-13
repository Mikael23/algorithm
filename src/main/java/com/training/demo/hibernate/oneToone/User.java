package com.training.demo.hibernate.oneToone;


import com.training.demo.hibernate.oneToMany.ItemWithUser;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    public Set<ItemWithUser> getBoughtItemWithUsers() {
        return boughtItemWithUsers;
    }

    public void setBoughtItemWithUsers(Set<ItemWithUser> boughtItemWithUsers) {
        this.boughtItemWithUsers = boughtItemWithUsers;
    }

    @OneToMany(mappedBy = "buyer")
    protected Set<ItemWithUser> boughtItemWithUsers = new HashSet<ItemWithUser>();

    @Id
    @GeneratedValue
    protected Long id;
    protected String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    protected Address shippingAddress;

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}
