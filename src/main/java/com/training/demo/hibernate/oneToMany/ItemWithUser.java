package com.training.demo.hibernate.oneToMany;


import com.training.demo.hibernate.oneToone.User;

import javax.persistence.*;

@Entity
public class ItemWithUser {

    @Id
    @GeneratedValue
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "ITEM_BUYER",
            joinColumns = @JoinColumn(name = "ITEM_ID"),
            inverseJoinColumns = @JoinColumn(nullable = false))
    protected User buyer;
}
