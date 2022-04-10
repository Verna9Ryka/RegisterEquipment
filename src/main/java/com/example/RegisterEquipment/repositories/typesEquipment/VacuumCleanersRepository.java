package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.models.typesEquipment.VacuumCleaners;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VacuumCleanersRepository extends JpaRepository<VacuumCleaners, Long> {
    public List<Computers> findAllById(final Long value);
    public List<Computers> findAllByName(final String value);
    public List<Computers> findAllBySerialNumber(final String value);
    public List<Computers> findAllByColor(final String value);
    public List<Computers> findAllBySize(final String value);
    public List<Computers> findAllByCost(final int value);
    public List<Computers> findAllByInStock(final String value);
    public List<Computers> findAllByVolumeDustCollector(final int value);
    public List<Computers> findAllByNumberModes(final int value);
}