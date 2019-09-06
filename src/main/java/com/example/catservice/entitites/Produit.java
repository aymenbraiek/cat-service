package com.example.catservice.entitites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity


public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private double price;
    private int quantité;

   @Override
   public String toString() {
      return "Produit{" +
              "id=" + id +
              ", designation='" + designation + '\'' +
              ", price=" + price +
              ", quantité=" + quantité +
              '}';
   }

   public Produit() {
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getDesignation() {
      return designation;
   }

   public void setDesignation(String designation) {
      this.designation = designation;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public int getQuantité() {
      return quantité;
   }

   public void setQuantité(int quantité) {
      this.quantité = quantité;
   }

   public Produit(Long id, String designation, double price, int quantité) {
        this.id = id;
        this.designation = designation;
        this.price = price;
        this.quantité = quantité;
    }
}
