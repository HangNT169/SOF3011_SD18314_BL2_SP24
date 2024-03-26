package com.sof3011.hangnt169.B10_Hibernate.repository;

import com.sof3011.hangnt169.B10_Hibernate.config.HibernateConfig;
import com.sof3011.hangnt169.B10_Hibernate.entity.Category1;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CategoryRepository {
    // CRUD: CREATE/ READ / UPDATE/ DELETE

    // GET ALL
    public List<Category1>getAll(){
        Session s = HibernateConfig.getFACTORY().openSession(); // Mo phien session
        List<Category1>lists = s.createQuery("FROM Category1 ").list();
        return lists;
    }

    // GET ONE
    public Category1 getOne(Long id){
        Session s = HibernateConfig.getFACTORY().openSession(); // Mo phien session
        String sql ="FROM Category1 WHERE id123 =:id";
        Query q = s.createQuery(sql);
        q.setParameter(1,id);
        return (Category1) q.getSingleResult(); // Chi tra ra du lieu 1 dong
    }

    // Add => persist
    public void add(Category1 c){
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran = s.beginTransaction();
            s.persist(c); // ADD
            tran.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // Update => merge
    public void merge(Category1 c){
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran = s.beginTransaction();
            s.merge(c); // UPDATE
            tran.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // Delete => delete
    public void delete(Category1 c){
        Transaction tran = null;
        try{
            Session s = HibernateConfig.getFACTORY().openSession();
            tran = s.beginTransaction();
            s.delete(c); // DELETE
            tran.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}
