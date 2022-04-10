package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.Televisions;
import com.example.RegisterEquipment.models.typesEquipment.Televisions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelevisionsRepository extends JpaRepository<Televisions, Long> {
    public List<Televisions> findAllById(final Long value);
    public List<Televisions> findAllByName(final String value);
    public List<Televisions> findAllBySerialNumber(final String value);
    public List<Televisions> findAllByColorIgnoreCase(final String value);
    public List<Televisions> findAllBySize(final String value);
    public List<Televisions> findAllByCost(final int value);
    public List<Televisions> findAllByInStockIgnoreCase(final String value);
    public List<Televisions> findAllByCategory(final String value);
    public List<Televisions> findAllByTechnology(final String value);
}