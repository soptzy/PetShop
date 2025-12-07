package com.petshop.model;
import jakarta.persistence.*;
@Entity
public class User{
@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;private String username;private String password;
public Long getId(){return id;}public void setId(Long id){this.id=id;}
public String getUsername(){return username;}public void setUsername(String u){username=u;}
public String getPassword(){return password;}public void setPassword(String p){password=p;}
}