package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.*;

@MappedSuperclass
/*@Entity
@Inheritance(strategy = InheritanceType.JOINED)*/
public abstract class BaseType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected Long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "serial_number")
    protected String serialNumber;

    @Column(name = "color")
    protected String color;

    @Column(name = "size")
    protected String size;

    @Column(name = "cost")
    protected int cost;

    @Column(name = "in_stock")
    protected String inStock;

    public BaseType() {
    }

    public BaseType(Long id, String name, String serialNumber, String color, String size, int cost, String inStock) {
        this.id = id;
        this.name = name;
        this.serialNumber = serialNumber;
        this.color = color;
        this.size = size;
        this.cost = cost;
        this.inStock = inStock;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    public void print() {
        System.out.println(id + " | " + name + " | " + serialNumber + " | " + color + " | " +
                size + " | " + cost + " | ");
    }
}