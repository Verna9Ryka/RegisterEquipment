package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.Smartphones;
import com.example.RegisterEquipment.models.typesEquipment.Smartphones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmartphonesRepository extends JpaRepository<Smartphones, Long> {
    public List<Smartphones> findAllById(final Long value);
    public List<Smartphones> findAllByName(final String value);
    public List<Smartphones> findAllBySerialNumber(final String value);
    public List<Smartphones> findAllByColorIgnoreCase(final String value);
    public List<Smartphones> findAllBySize(final String value);
    public List<Smartphones> findAllByCost(final int value);
    public List<Smartphones> findAllByInStockIgnoreCase(final String value);
    public List<Smartphones> findAllByMemory(final int value);
    public List<Smartphones> findAllByNumberCameras(final int value);
}