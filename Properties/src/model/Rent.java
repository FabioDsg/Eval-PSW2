/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="RENT")
public class Rent extends Immobile {
    
    //private int id;
    private double price;
    private int monthBeginner;

    public Rent() {
    }
    
    

   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
*/
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMonthBeginner() {
        return monthBeginner;
    }

    public void setMonthBeginner(int monthBeginner) {
        this.monthBeginner = monthBeginner;
    }
    
}
