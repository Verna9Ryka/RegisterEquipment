package com.example.RegisterEquipment.services.typesEquipment;

import com.example.RegisterEquipment.models.Register;
import com.example.RegisterEquipment.models.typesEquipment.BaseType;
import com.example.RegisterEquipment.models.typesEquipment.Computers;
import com.example.RegisterEquipment.repositories.RegisterRepository;
import com.example.RegisterEquipment.repositories.typesEquipment.ComputersRepository;
import com.example.RegisterEquipment.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputersService {
    public static enum Order {
        ASC,
        DESC
    }

    @Autowired
    private ComputersRepository сomputersRepository;

    public List<Computers> find(final Computers.Attribute attribute, final String value) {
        List<Computers> list = null;
        switch (attribute) {
            case NAME: {
                list = this.сomputersRepository.findAllByName(value);
                break;
            }
            case SERIAL_NUMBER: {
                list = this.сomputersRepository.findAllBySerialNumber(value);
                break;
            }
            case COLOR: {
                list = this.сomputersRepository.findAllByColor(value);
                break;
            }
            case SIZE: {
                list = this.сomputersRepository.findAllBySize(value);
                break;
            }
            case IN_STOCK: {
                list = this.сomputersRepository.findAllByInStock(value);
                break;
            }
            case CATEGORY: {
                list = this.сomputersRepository.findAllByCategory(value);
                break;
            }
            case TYPE_PROCESSOR: {
                list = this.сomputersRepository.findAllByTypeProcessor(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Computers> find(final Computers.Attribute attribute, final int value) {
        List<Computers> list = null;
        switch (attribute) {
            case NAME: {
                list = this.сomputersRepository.findAllByCost(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public void save(Computers value) {
        this.сomputersRepository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.сomputersRepository.deleteById(id);
    }
}
