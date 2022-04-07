package com.example.RegisterEquipment.models.typesEquipment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vacuum_cleaners")
public class VacuumCleaners extends BaseType {
    @Column(name = "volume_dust_collector")
    private Long volumeDustCollector;

    @Column(name = "number_modes")
    private Long numberModes;

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