package com.sof3011.hangnt169.B10_Hibernate.repository;

import com.sof3011.hangnt169.B10_Hibernate.config.HibernateConfig;
import com.sof3011.hangnt169.B10_Hibernate.entity.Product;

import java.util.List;
import org.hibernate.Session;

public class ProductRepository {

    // Product ID, Product Code, Product Name, Price , Category Code, Category Name
//    public List<ProductResponse>getAll(){
//        String hql = """
//                     SELECT new com.sof3011.hangnt169.B10_Hibernate.response.ProductResponse(
//                     p.id1,p.productCode,p.productName,p.category1.categoryCode,p.category1.categoryName
//                     p.price
//                     )
//                     FROM Product p JOIN Category1 c 
//                     ON p.category1.id = c.id
//                     """;         
//        Session s = HibernateConfig.getFACTORY().openSession();
//        List<ProductResponse>lists = s.createQuery(hql).list();
//        return lists;
//    }
    public List<Product> getAll() {
        Session s = HibernateConfig.getFACTORY().openSession();
        return s.createQuery("FROM Product").list();
    }
}
