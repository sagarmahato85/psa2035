package com.crm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="products")
public class Product {
    @Id
    private String pId;
    private String productName;

    public Product(String pId,String productName) {
        this.pId=pId;
        this.productName = productName;
    }

    @ManyToMany(mappedBy = "productList")
private List<Category> categoryList=new ArrayList<>();
    public Product() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
