package com.example.dbsample01;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//test coment
@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;

    //GETTER,SETTER
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
