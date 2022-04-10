package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "refrigerators")
public class Refrigerators extends BaseType {

    @Column(name = "number_doors")
    private int numberDoors;

    @Column(name = "type_compressor")
    private String typeCompressor;

    public Refrigerators() {
    }

    public Refrigerators(Long id, String name, String serialNumber, String color, String size,
                         int cost, String inStock, int numberDoors, String typeCompressor) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.numberDoors = numberDoors;
        this.typeCompressor = typeCompressor;
    }

    public Refrigerators(String name, String serialNumber, String color, String size,
                         int cost, String inStock, int numberDoors, String typeCompressor) {
        super(name, serialNumber, color, size, cost, inStock);
        this.numberDoors = numberDoors;
        this.typeCompressor = typeCompressor;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public String getTypeCompressor() {
        return typeCompressor;
    }

    public void setTypeCompressor(String typeCompressor) {
        this.typeCompressor = typeCompressor;
    }
}