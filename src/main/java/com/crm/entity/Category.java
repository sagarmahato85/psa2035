package com.crm.entity;

import aj.org.objectweb.asm.ByteVector;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
   // public int getProducts;
    @Id
    private String cId;
private String title;



    public Category(String cId, String title) {
        this.cId = cId;
        this.title=title;
    }
    @ManyToMany(cascade = CascadeType.ALL)

    private List<Product> productList=new ArrayList<>();
    public Category() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
