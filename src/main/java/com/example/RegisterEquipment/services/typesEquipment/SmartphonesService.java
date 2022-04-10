package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.enums.RefrigeratorsAttributes;
import com.example.RegisterEquipment.enums.SmartphonesAttributes;
import com.example.RegisterEquipment.models.typesEquipment.Refrigerators;
import com.example.RegisterEquipment.models.typesEquipment.Smartphones;
import com.example.RegisterEquipment.repositories.typesEquipment.SmartphonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartphonesService {
    
    private List<Smartphones> list;

    @Autowired
    private SmartphonesRepository repository;

    public List<Smartphones> find(final SmartphonesAttributes attribute, final Long value) {
        switch (attribute) {
            case ID: {
                list = this.repository.findAllById(value);
                break;
            }
            case COST: {
                list = this.repository.findAllByCost(Math.toIntExact(value));
                break;
            }
            case MEMORY: {
                list = this.repository.findAllByMemory(Math.toIntExact(value));
                break;
            }
            case NUMBER_CAMERAS: {
                list = this.repository.findAllByNumberCameras(Math.toIntExact(value));
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Smartphones> find(final SmartphonesAttributes attribute, final String value) {
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
            default:
                break;
        }
        return list;
    }

    public List<Smartphones> sortSelection(final SmartphonesAttributes attribute, final Sort.Direction direction) throws Exception {
        return this.repository.findAll((direction == Sort.Direction.ASC) ? Sort.by(SmartphonesAttributes.getAttributeName(attribute)).ascending() : Sort.by(SmartphonesAttributes.getAttributeName(attribute)).descending());
    }

    public void save(Smartphones value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
