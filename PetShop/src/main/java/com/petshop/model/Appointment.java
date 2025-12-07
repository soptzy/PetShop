package com.petshop.model;
import jakarta.persistence.*;import java.time.LocalDateTime;
@Entity
public class Appointment{
@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;private String petName;private String serviceType;private LocalDateTime dateTime;
@ManyToOne private User owner;
public Long getId(){return id;}public void setId(Long id){this.id=id;}
public String getPetName(){return petName;}public void setPetName(String p){petName=p;}
public String getServiceType(){return serviceType;}public void setServiceType(String s){serviceType=s;}
public LocalDateTime getDateTime(){return dateTime;}public void setDateTime(LocalDateTime d){dateTime=d;}
public User getOwner(){return owner;}public void setOwner(User o){owner=o;}
}