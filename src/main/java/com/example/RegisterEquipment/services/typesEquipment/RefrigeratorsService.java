package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.enums.RefrigeratorsAttributes;
import com.example.RegisterEquipment.models.typesEquipment.Refrigerators;
import com.example.RegisterEquipment.repositories.typesEquipment.RefrigeratorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RefrigeratorsService {
    @Autowired
    private RefrigeratorsRepository repository;

    public List<Refrigerators> find(final RefrigeratorsAttributes attribute, final Long value) {
        List<Refrigerators> list = null;
        switch (attribute) {
            case ID: {
                list = this.repository.findAllById(value);
                break;
            }
            case COST: {
                list = this.repository.findAllByCost(Math.toIntExact(value));
                break;
            }
            case NUMBER_DOORS: {
                list = this.repository.findAllByNumberDoors(Math.toIntExact(value));
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Refrigerators> find(final RefrigeratorsAttributes attribute, final String value) {
        List<Refrigerators> list = null;
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
                list = this.repository.findAllByColor(value);
                break;
            }
            case SIZE: {
                list = this.repository.findAllBySize(value);
                break;
            }
            case IN_STOCK: {
                list = this.repository.findAllByInStock(value);
                break;
            }
            case TYPE_COMPRESSOR: {
                list = this.repository.findAllByTypeCompressor(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public void save(Refrigerators value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
