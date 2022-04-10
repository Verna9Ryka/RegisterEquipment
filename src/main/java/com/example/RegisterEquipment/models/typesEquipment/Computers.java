package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "computers")
public class Computers extends BaseType {

    public static enum Attribute{
        NAME,
        SERIAL_NUMBER,
        COLOR,
        SIZE,
        COST,
        CATEGORY,
        TYPE_PROCESSOR,
        IN_STOCK
    }

    @Column(name = "category")
    private String category;

    @Column(name = "type_processor")
    private String typeProcessor;

    public Computers() {
    }

    public Computers(Long id, String name, String serialNumber, String color, String size,
                     int cost, String inStock, String category, String typeProcessor) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.category = category;
        this.typeProcessor = typeProcessor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(String typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    public void print() {
        super.print();
        System.out.println(category + " | " + typeProcessor + " | " + inStock);
    }
}