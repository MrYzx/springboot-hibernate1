package com.example.springboothibernate.dao.Impl;

import com.example.springboothibernate.beans.User;
import com.example.springboothibernate.dao.UserDao;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public List showUser() {
        List list = sessionFactory.getCurrentSession().createCriteria(User.class)
                .add(Restrictions.ge("age", 10))
                .list();
        return (List<User>) list;
    }

    @Override
    public int saveUser(User user) {
        try{
            sessionFactory.getCurrentSession().save(user);
        }catch (Exception e){
            e.printStackTrace();
            return 0;
        }
        return 1;
    }
}
