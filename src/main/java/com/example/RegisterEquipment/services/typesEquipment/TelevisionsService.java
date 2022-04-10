package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.enums.TelevisionsAttributes;
import com.example.RegisterEquipment.models.typesEquipment.Televisions;
import com.example.RegisterEquipment.repositories.typesEquipment.TelevisionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelevisionsService {

    private List<Televisions> list;

    @Autowired
    private TelevisionsRepository repository;

    public List<Televisions> find(final TelevisionsAttributes attribute, final Long value) {
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

    public List<Televisions> find(final TelevisionsAttributes attribute, final String value) {
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
            case CATEGORY: {
                list = this.repository.findAllByCategory(value);
                break;
            }
            case TECHNOLOGY: {
                list = this.repository.findAllByTechnology(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public void save(Televisions value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
