package com.training.demo.hibernate.manyToOne;


import com.training.demo.hibernate.manyToOne.Item;

import javax.persistence.*;

@Entity
public class Bid {


    @Id
    protected Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_ID", nullable = false)
    protected Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
