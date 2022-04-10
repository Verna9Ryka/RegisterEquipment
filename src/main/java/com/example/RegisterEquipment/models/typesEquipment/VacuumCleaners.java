package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vacuum_cleaners")
public class VacuumCleaners extends BaseType {

    @Column(name = "volume_dust_collector")
    private int volumeDustCollector;

    @Column(name = "number_modes")
    private int numberModes;

    public VacuumCleaners() {
    }

    public VacuumCleaners(Long id, String name, String serialNumber, String color, String size,
                          int cost, String inStock, int volumeDustCollector, int numberModes) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.volumeDustCollector = volumeDustCollector;
        this.numberModes = numberModes;
    }

    public int getVolumeDustCollector() {
        return volumeDustCollector;
    }

    public void setVolumeDustCollector(int volumeDustCollector) {
        this.volumeDustCollector = volumeDustCollector;
    }

    public int getNumberModes() {
        return numberModes;
    }

    public void setNumberModes(int numberModes) {
        this.numberModes = numberModes;
    }
}