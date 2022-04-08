package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "smartphones")
public class Smartphones extends BaseType {
    @Column(name = "memory")
    private int memory;

    @Column(name = "number_cameras")
    private int numberCameras;

    public Smartphones() {
    }

    public Smartphones(Long id, String name, String serialNumber, String color, String size,
                       int cost, String inStock, int memory, int numberCameras) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.memory = memory;
        this.numberCameras = numberCameras;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getNumberCameras() {
        return numberCameras;
    }

    public void setNumberCameras(int numberCameras) {
        this.numberCameras = numberCameras;
    }
}