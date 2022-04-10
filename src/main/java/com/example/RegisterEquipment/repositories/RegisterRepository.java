package com.example.RegisterEquipment.repositories;

import java.util.List;
import com.example.RegisterEquipment.models.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {

    public List<Register> findAllById(final Long value);
    public List<Register> findAllByTypeEquipment(final String value);
    public List<Register> findAllByProducerCountry(final String value);
    public List<Register> findAllByProducerCompany(final String value);
    public List<Register> findAllByOrderOnline(final String value);
    public List<Register> findAllByInstallments(final String value);
    public List<Register> findAllByNameModelLine(final String value);
    public List<Register> findAllByNameModel(final String value);
}