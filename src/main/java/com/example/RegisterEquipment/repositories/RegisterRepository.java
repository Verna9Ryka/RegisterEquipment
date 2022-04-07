package com.example.RegisterEquipment.repositories;

import com.example.RegisterEquipment.models.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {
}