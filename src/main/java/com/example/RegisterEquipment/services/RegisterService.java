package com.example.RegisterEquipment.services;

import com.example.RegisterEquipment.models.Register;
import com.example.RegisterEquipment.repositories.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class RegisterService {

    public static enum Order {
        ASC,
        DESC
    }

    @Autowired
    private RegisterRepository registerRepository;

    public List<Register> selectOrder(final Register.Attribute attribute, final RegisterService.Order order) throws Exception {
        Sort sort = null;
        switch (attribute) {
            case TYPE_EQUIPMENT: {
                if (order == Order.ASC) {
                    sort = Sort.by("type_equipment").ascending();
                } else if (order == Order.DESC)
                {
                    sort = Sort.by("type_equipment").descending();
                }
                break;
            }
            default:
                sort = Sort.by("type_equipment").ascending();
        }
        return this.registerRepository.findAll(sort);
    }

    public List<Register> find(final Register.Attribute attribute, final long value) {
        List<Register> list = null;
        switch (attribute) {
            case Id: {
                list = this.registerRepository.findAllById(value);
                break;
            }
            default:
                break;
        }
        return list;
    }

    public List<Register> find(final Register.Attribute attribute, final String value) {
        List<Register> list = null;
        switch (attribute) {
            case TYPE_EQUIPMENT: {
                list = this.registerRepository.findAllByTypeEquipment(value);
                break;
            }
            case PRODUCER_COUNTRY: {
                list = this.registerRepository.findAllByProducerCountry(value);
                break;
            }
            case PRODUCER_COMPANY: {
                list = this.registerRepository.findAllByProducerCompany(value);
                break;
            }
            case ORDER_ONLINE: {
                list = this.registerRepository.findAllByOrderOnline(value);
                break;
            }
            case INSTALLMENTS: {
                list = this.registerRepository.findAllByInstallments(value);
                break;
            }
            case NAME_MODEL_LINE: {
                list = this.registerRepository.findAllByNameModelLine(value);
                break;
            }
            case NAME_MODEL: {
                list = this.registerRepository.findAllByNameModel(value);
                break;
            }
            default:
               break;
        }
        return list;
    }

    public void save(Register value) {
        this.registerRepository.saveAndFlush(value);
    }

    public void delete(final Long id) {
        this.registerRepository.deleteById(id);
    }
}
