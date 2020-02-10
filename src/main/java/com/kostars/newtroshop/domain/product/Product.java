package com.kostars.newtroshop.domain.product;

import com.kostars.newtroshop.domain.product.category.Category;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicInsert
@Builder
@ToString(exclude = {"categories"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String productName;

    private BigDecimal productPrice;

    private String productContent;

    private String productColor;

    @CreatedDate
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private int productStock;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "product_category", joinColumns = @JoinColumn(name = "productId")
    , inverseJoinColumns = @JoinColumn(name = "categoryId"))
    private List<Category> categories;

}
