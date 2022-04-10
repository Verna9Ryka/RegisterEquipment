package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "televisions")
public class Televisions extends BaseType {

    public static enum Attribute{
        NAME,
        SERIAL_NUMBER,
        COLOR,
        SIZE,
        COST,
        CATEGORY,
        TECHNOLOGY,
        IN_STOCK
    }

    @Column(name = "category")
    private String category;

    @Column(name = "technology")
    private String technology;

    public Televisions() {
    }

    public Televisions(Long id, String name, String serialNumber, String color, String size,
                       int cost, String inStock, String category, String technology) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.category = category;
        this.technology = technology;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}