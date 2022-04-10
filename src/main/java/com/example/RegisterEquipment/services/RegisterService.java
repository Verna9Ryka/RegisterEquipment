package com.example.RegisterEquipment.services;

import com.example.RegisterEquipment.enums.RegisterAttributes;
import com.example.RegisterEquipment.models.Register;
import com.example.RegisterEquipment.repositories.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class RegisterService {

    private List<Register> list;

    @Autowired
    private RegisterRepository repository;

    public List<Register> find(final RegisterAttributes attribute, final long value) {
        switch (attribute) {
            case ID: {
                list = this.repository.findAllById(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Register> find(final RegisterAttributes attribute, final String value) {
        switch (attribute) {
            case TYPE_EQUIPMENT: {
                list = this.repository.findAllByTypeEquipmentIgnoreCase(value);
                break;
            }
            case PRODUCER_COUNTRY: {
                list = this.repository.findAllByProducerCountryIgnoreCase(value);
                break;
            }
            case PRODUCER_COMPANY: {
                list = this.repository.findAllByProducerCompany(value);
                break;
            }
            case ORDER_ONLINE: {
                list = this.repository.findAllByOrderOnlineIgnoreCase(value);
                break;
            }
            case INSTALLMENTS: {
                list = this.repository.findAllByInstallmentsIgnoreCase(value);
                break;
            }
            case NAME_MODEL_LINE: {
                list = this.repository.findAllByNameModelLineIgnoreCase(value);
                break;
            }
            case NAME_MODEL: {
                list = this.repository.findAllByNameModel(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Register> sortSelection(final RegisterAttributes attribute, final Sort.Direction direction){
        return this.repository.findAll((direction == Sort.Direction.ASC) ? Sort.by(RegisterAttributes.getAttributeName(attribute)).ascending() : Sort.by(RegisterAttributes.getAttributeName(attribute)).descending());
    }

    public void save(Register value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
