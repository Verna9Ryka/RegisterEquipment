package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.VacuumCleaners;
import com.example.RegisterEquipment.models.typesEquipment.VacuumCleaners;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VacuumCleanersRepository extends JpaRepository<VacuumCleaners, Long> {
    public List<VacuumCleaners> findAllById(final Long value);
    public List<VacuumCleaners> findAllByName(final String value);
    public List<VacuumCleaners> findAllBySerialNumber(final String value);
    public List<VacuumCleaners> findAllByColorIgnoreCase(final String value);
    public List<VacuumCleaners> findAllBySize(final String value);
    public List<VacuumCleaners> findAllByCost(final int value);
    public List<VacuumCleaners> findAllByInStockIgnoreCase(final String value);
    public List<VacuumCleaners> findAllByVolumeDustCollector(final int value);
    public List<VacuumCleaners> findAllByNumberModes(final int value);
}