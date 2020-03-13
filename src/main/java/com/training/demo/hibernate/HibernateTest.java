package com.training.demo.hibernate;

import com.training.demo.hibernate.oneToMany.ItemWithUser;
import com.training.demo.hibernate.oneToone.Address;
import com.training.demo.hibernate.oneToone.User;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@Log
public class HibernateTest {


    @PersistenceContext
    private EntityManager entityManager;

//    static {
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.training.demo.hibernate");
//        entityManager = entityManagerFactory.createEntityManager();
//    }


    @Transactional
    @GetMapping(value = "/test-hibernate")
    public void saveAddress() {

        User user = new User();
        user.setName("name");
        Address address = new Address();
        address.setCity("city");
        address.setStreet("street");
        address.setUser(user);
        user.setShippingAddress(address);
        log.info(user.toString());
        entityManager.persist(user);
        ItemWithUser itemWithUser = new ItemWithUser();
//        itemWithUser.setBuyer(user);
        entityManager.persist(itemWithUser);

    }


}
