package com.sof3011.hangnt169.B10_Hibernate.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    // Product ID, Product Code, Product Name, Price , Category Code, Category Name

    private Long productID;

    private String productCode;

    private String productName;

    private String categoryCode;

    private String categoryName;

    private Float price;

}
