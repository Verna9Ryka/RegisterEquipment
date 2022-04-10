package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.models.typesEquipment.Televisions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelevisionsRepository extends JpaRepository<Televisions, Long> {
    public List<Computers> findAllById(final Long value);
    public List<Computers> findAllByName(final String value);
    public List<Computers> findAllBySerialNumber(final String value);
    public List<Computers> findAllByColor(final String value);
    public List<Computers> findAllBySize(final String value);
    public List<Computers> findAllByCost(final int value);
    public List<Computers> findAllByInStock(final String value);
    public List<Computers> findAllByCategory(final String value);
    public List<Computers> findAllByTechnology(final String value);
}