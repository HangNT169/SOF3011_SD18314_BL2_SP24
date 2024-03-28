/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sof3011.hangnt169.B10_Hibernate.service;

import com.sof3011.hangnt169.B10_Hibernate.entity.Product;
import com.sof3011.hangnt169.B10_Hibernate.repository.ProductRepository;
import com.sof3011.hangnt169.B10_Hibernate.response.ProductResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class ProductService {

    public List<ProductResponse> getList() {
        // convert Product -> ProductResponse 
        List<ProductResponse> lists = new ArrayList<>();
        List<Product> products = new ProductRepository().getAll();
        for (Product p : products) {
            lists.add(convertProductToResponse(p));
        }
        return lists;
    }

    private ProductResponse convertProductToResponse(Product p) {
        ProductResponse response = new ProductResponse();
        response.setProductID(p.getId1());
        response.setProductCode(p.getProductCode());
        response.setProductName(p.getProductName());
        response.setPrice(p.getPrice());
        response.setCategoryCode(p.getCategory1().getCategoryCode());
        response.setCategoryName(p.getCategory1().getCategoryName());
        return response;
    }
}
