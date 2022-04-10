package com.example.RegisterEquipment.repositories;

import java.util.List;
import com.example.RegisterEquipment.models.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {

    public List<Register> findAllById(final Long value);
    public List<Register> findAllByTypeEquipmentIgnoreCase(final String value);
    public List<Register> findAllByProducerCountryIgnoreCase(final String value);
    public List<Register> findAllByProducerCompany(final String value);
    public List<Register> findAllByOrderOnlineIgnoreCase(final String value);
    public List<Register> findAllByInstallmentsIgnoreCase(final String value);
    public List<Register> findAllByNameModelLineIgnoreCase(final String value);
    public List<Register> findAllByNameModel(final String value);
}