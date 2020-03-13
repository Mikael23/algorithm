package com.training.demo.hibernate.manyToOne;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Item {


    public Set<Bid> getBids() {
        return bids;
    }

    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }

    @OneToMany(mappedBy = "item", cascade = {CascadeType.PERSIST, CascadeType.REMOVE},orphanRemoval = true)
    protected Set<Bid> bids = new HashSet<>();

    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
