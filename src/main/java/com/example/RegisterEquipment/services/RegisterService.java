package com.example.RegisterEquipment.services;

import com.example.RegisterEquipment.enums.RegisterAttributes;
import com.example.RegisterEquipment.enums.SortDirection;
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
                list = this.repository.findAllByTypeEquipment(value);
                break;
            }
            case PRODUCER_COUNTRY: {
                list = this.repository.findAllByProducerCountry(value);
                break;
            }
            case PRODUCER_COMPANY: {
                list = this.repository.findAllByProducerCompany(value);
                break;
            }
            case ORDER_ONLINE: {
                list = this.repository.findAllByOrderOnline(value);
                break;
            }
            case INSTALLMENTS: {
                list = this.repository.findAllByInstallments(value);
                break;
            }
            case NAME_MODEL_LINE: {
                list = this.repository.findAllByNameModelLine(value);
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

    public List<Register> selectOrder(final RegisterAttributes attribute, final SortDirection direction) throws Exception {
        Sort sort = null;
        String name_column = null;
        switch (attribute) {
            case ID: {
                name_column = "id";
                break;
            }
            case TYPE_EQUIPMENT: {
                name_column = "type_equipment";
                break;
            }
            case PRODUCER_COUNTRY: {
                name_column = "producer_country";
                break;
            }
            case PRODUCER_COMPANY: {
                name_column = "producer_company";
                break;
            }
            case ORDER_ONLINE: {
                name_column = "order_online";
                break;
            }
            case INSTALLMENTS: {
                name_column = "installments";
                break;
            }
            case NAME_MODEL_LINE: {
                name_column = "name_model_line";
                break;
            }
            case NAME_MODEL: {
                name_column = "name_model";
                break;
            }
            default:
                break;
        }
        if (direction == direction.ASC) {
            sort = Sort.by(name_column).ascending();
        } else if (direction == direction.DESC)
        {
            sort = Sort.by(name_column).descending();
        }
        return this.repository.findAll(sort);
    }

    public void save(Register value) {
        this.repository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.repository.deleteById(id);
    }
}
