package com.sof3011.hangnt169.B10_Hibernate.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category") // Ten cua table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category1 {
    /**
     * J3: JDBC(Java Database Conectivity) => Truy van su dung cau lenh trong SQL
     * J4: Hibernate:
     *      1. Truy van dua vao cau SQL
     *      2. Truy van tren thuc the (HQL - Hibernate Query Language)  => TRUY VAN TREN CLASS
     * J5: JPA:
     *      1. Truy van bang cau lenh SQL : native query
     *      2. Truy van tren thuc the (JPQL - JPA Query Language) => truy van tren class
     * ORM(Object Relationship Mapping): Mapping tu bang => thanh class
     * 1. Mapping table => thuc the
     *      1 class => 1 table
     *      thuoc tinh => column cua table: khoa chinh, khoa ngoai, cot binh thuong
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id123;

    @Column(name = "category_code")

    private String categoryCode;

    @Column(name = "category_name")
    private String categoryName;

}
