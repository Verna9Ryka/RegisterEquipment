package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.Refrigerators;
import com.example.RegisterEquipment.models.typesEquipment.Refrigerators;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RefrigeratorsRepository extends JpaRepository<Refrigerators, Long> {
    public List<Refrigerators> findAllById(final Long value);
    public List<Refrigerators> findAllByName(final String value);
    public List<Refrigerators> findAllBySerialNumber(final String value);
    public List<Refrigerators> findAllByColor(final String value);
    public List<Refrigerators> findAllBySize(final String value);
    public List<Refrigerators> findAllByCost(final int value);
    public List<Refrigerators> findAllByInStock(final String value);
    public List<Refrigerators> findAllByNumberDoors(final int value);
    public List<Refrigerators> findAllByTypeCompressor(final String value);
}