package com.example.RegisterEquipment.models;

import javax.persistence.*;

@Entity
@Table(name = "register")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type_equipment")
    private String typeEquipment;

    @Column(name = "producer_country")
    private String producerCountry;

    @Column(name = "producer_company")
    private String producerCompany;

    @Column(name = "order_online", length = 3)
    private String orderOnline;

    @Column(name = "installments", length = 3)
    private String installments;

    @Column(name = "name_model_line")
    private String nameModelLine;

    @Column(name = "name_model")
    private String nameModel;

    public Register() {
    }

    public Register(Long id, String typeEquipment, String producerCountry, String producerCompany,
                    String orderOnline, String installments, String nameModelLine, String nameModel) {
        this.id = id;
        this.typeEquipment = typeEquipment;
        this.producerCountry = producerCountry;
        this.producerCompany = producerCompany;
        this.orderOnline = orderOnline;
        this.installments = installments;
        this.nameModelLine = nameModelLine;
        this.nameModel = nameModel;
    }

    public Register(String typeEquipment, String producerCountry, String producerCompany,
                    String orderOnline, String installments, String nameModelLine, String nameModel) {
        this.typeEquipment = typeEquipment;
        this.producerCountry = producerCountry;
        this.producerCompany = producerCompany;
        this.orderOnline = orderOnline;
        this.installments = installments;
        this.nameModelLine = nameModelLine;
        this.nameModel = nameModel;
    }

    public Long getId() {
        return id;
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

    public String getNameModelLine() { return nameModelLine; }

    public void setNameModelLine(String nameModelLine) { this.nameModelLine = nameModelLine; }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public void print() {
        System.out.println(id + " | " + typeEquipment + " | " + producerCountry + " | " + producerCompany + " | " +
                orderOnline + " | " + installments + " | " + nameModelLine + " | " + nameModel);
    }
}