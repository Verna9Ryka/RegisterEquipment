package com.example.RegisterEquipment.models;

import javax.persistence.*;

@Entity
@Table(name = "register")
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type_equipment", nullable = false)
    private String typeEquipment;

    @Column(name = "producer_country")
    private String producerCountry;

    @Column(name = "producer_company")
    private String producerCompany;

    @Column(name = "order_online", length = 3)
    private String orderOnline;

    @Column(name = "installments", length = 3)
    private String installments;

    @Column(name = "name_model", nullable = false)
    private String nameModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeEquipment() {
        return typeEquipment;
    }

    public void setTypeEquipment(String typeEquipment) {
        this.typeEquipment = typeEquipment;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setProducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    public String getOrderOnline() {
        return orderOnline;
    }

    public void setOrderOnline(String orderOnline) {
        this.orderOnline = orderOnline;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }
}