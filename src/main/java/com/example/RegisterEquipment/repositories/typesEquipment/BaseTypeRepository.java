package com.example.RegisterEquipment.repositories.typesEquipment;

import com.example.RegisterEquipment.models.typesEquipment.BaseType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseTypeRepository<T extends BaseType, ID extends Long> extends JpaRepository<T, ID> {
}