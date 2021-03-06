package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.enums.TelevisionsAttributes;
import com.example.RegisterEquipment.enums.VacuumCleanersAttributes;
import com.example.RegisterEquipment.models.typesEquipment.Televisions;
import com.example.RegisterEquipment.models.typesEquipment.VacuumCleaners;
import com.example.RegisterEquipment.repositories.typesEquipment.VacuumCleanersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacuumCleanersService {

    private List<VacuumCleaners> list;

    @Autowired
    private VacuumCleanersRepository repository;

    public List<VacuumCleaners> find(final VacuumCleanersAttributes attribute, final Long value) {
        switch (attribute) {
            case ID: {
                list = this.repository.findAllById(value);
                break;
            }
            case COST: {
                list = this.repository.findAllByCost(Math.toIntExact(value));
                break;
            }
            case VOLUME_DUST_COLLECTOR: {
                list = this.repository.findAllByVolumeDustCollector(Math.toIntExact(value));
                break;
            }
            case NUMBER_MODES: {
                list = this.repository.findAllByNumberModes(Math.toIntExact(value));
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<VacuumCleaners> find(final VacuumCleanersAttributes attribute, final String value) {
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

    public List<VacuumCleaners> sortSelection(final VacuumCleanersAttributes attribute, final Sort.Direction direction) throws Exception {
        return this.repository.findAll((direction == Sort.Direction.ASC) ? Sort.by(VacuumCleanersAttributes.getAttributeName(attribute)).ascending() : Sort.by(VacuumCleanersAttributes.getAttributeName(attribute)).descending());
    }

    public void save(VacuumCleaners value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
