package com.example.cafe.wrapper;

import lombok.Data;

@Data
public class ProductWrapper {
    int id;

    String name;

    String description;

    int price;

    String status;

    int categoryId;

    String categoryName;

    public ProductWrapper(){

    }

    public ProductWrapper(int id ,String name,String description,int price ,String status,int categoryId,String categoryName){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.status=status;
        this.categoryId=categoryId;
        this.categoryName=categoryName;
    }
    public ProductWrapper(Integer id,String name){
        this.id=id;
        this.name=name;
    }
    public ProductWrapper(Integer id ,String name,String description,Integer price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
    }
}
