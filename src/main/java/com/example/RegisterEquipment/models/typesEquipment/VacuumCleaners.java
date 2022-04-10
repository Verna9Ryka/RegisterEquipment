package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vacuum_cleaners")
public class VacuumCleaners extends BaseType {

    public static enum Attribute{
        NAME,
        SERIAL_NUMBER,
        COLOR,
        SIZE,
        COST,
        VOLUME_DUST_COLLECTOR,
        NUMBER_MODES,
        IN_STOCK
    }

    @Column(name = "volume_dust_collector")
    private int volumeDustCollector;

    @Column(name = "number_modes")
    private int numberModes;

    public VacuumCleaners() {
    }

    public VacuumCleaners(Long id, String name, String serialNumber, String color, String size,
                          int cost, String inStock, Long volumeDustCollector, Long numberModes) {
        super(id, name, serialNumber, color, size, cost, inStock);
        this.volumeDustCollector = volumeDustCollector;
        this.numberModes = numberModes;
    }

    public Long getVolumeDustCollector() {
        return volumeDustCollector;
    }

    public void setVolumeDustCollector(Long volumeDustCollector) {
        this.volumeDustCollector = volumeDustCollector;
    }

    public Long getNumberModes() {
        return numberModes;
    }

    public void setNumberModes(Long numberModes) {
        this.numberModes = numberModes;
    }
}