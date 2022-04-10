package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.enums.ComputersAttributes;
import com.example.RegisterEquipment.enums.RegisterAttributes;
import com.example.RegisterEquipment.models.Register;
import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.repositories.typesEquipment.ComputersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputersService {

    private List<Computers> list;

    @Autowired
    private ComputersRepository repository;

    public List<Computers> find() {
        return this.repository.findAll();
    }

    public List<Computers> find(final ComputersAttributes attribute, final Long value) {
        switch (attribute) {
            case ID: {
                list = this.repository.findAllById(value);
                break;
            }
            case COST: {
                list = this.repository.findAllByCost(Math.toIntExact(value));
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Computers> find(final ComputersAttributes attribute, final String value) {
        switch (attribute) {
            case NAME: {
                list = this.repository.findAllByName(value);
                break;
            }
            case SERIAL_NUMBER: {
                list = this.repository.findAllBySerialNumber(value);
                break;
            }
            case COLOR: {
                list = this.repository.findAllByColorIgnoreCase(value);
                break;
            }
            case SIZE: {
                list = this.repository.findAllBySize(value);
                break;
            }
            case IN_STOCK: {
                list = this.repository.findAllByInStockIgnoreCase(value);
                break;
            }
            case CATEGORY: {
                list = this.repository.findAllByCategoryIgnoreCase(value);
                break;
            }
            case TYPE_PROCESSOR: {
                list = this.repository.findAllByTypeProcessor(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Computers> sortSelection(final ComputersAttributes attribute, final Sort.Direction direction) throws Exception {
        return this.repository.findAll((direction == Sort.Direction.ASC) ? Sort.by(ComputersAttributes.getAttributeName(attribute)).ascending() : Sort.by(ComputersAttributes.getAttributeName(attribute)).descending());
    }

    public void save(Computers value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
