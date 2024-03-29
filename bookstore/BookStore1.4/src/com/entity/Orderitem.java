package com.entity;



/**
 * Orderitem entity. @author MyEclipse Persistence Tools
 */

public class Orderitem  implements java.io.Serializable {


    // Fields    

     private Integer orderitemid;
     private Book book;
     private Orders orders;
     private Integer quantity;
     private Integer amount;


    // Constructors

    /** default constructor */
    public Orderitem() {
    }

	/** minimal constructor */
    public Orderitem(Book book, Orders orders, Integer quantity) {
        this.book = book;
        this.orders = orders;
        this.quantity = quantity;
    }
    
    /** full constructor */
    public Orderitem(Book book, Orders orders, Integer quantity, Integer amount) {
        this.book = book;
        this.orders = orders;
        this.quantity = quantity;
        this.amount = amount;
    }

   
    // Property accessors

    public Integer getOrderitemid() {
        return this.orderitemid;
    }
    
    public void setOrderitemid(Integer orderitemid) {
        this.orderitemid = orderitemid;
    }

    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }

    public Orders getOrders() {
        return this.orders;
    }
    
    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return this.amount;
    }
    
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
   








}