 package com.lexelpro.dao;

 import com.lexelpro.entity.User;
 import org.hibernate.HibernateException;
 import org.hibernate.Query;
 import org.hibernate.Session;
 import org.hibernate.SessionFactory;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Repository;

 import java.util.List;

 /**
  * @author Lexel PRO
  * @version 1.0
  */

 @Repository
 public class UserDAO {

     @Autowired
     private SessionFactory sessionFactory;

     public List<User> getAllUsers() {
             Session ses = sessionFactory.openSession();
             Query query = ses.createQuery(" from "+User.class.getName()+"");
             return query.list();
     }
 }