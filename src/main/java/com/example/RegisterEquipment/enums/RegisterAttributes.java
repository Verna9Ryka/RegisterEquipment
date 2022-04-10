package com.example.RegisterEquipment.enums;

public enum RegisterAttributes {
    ID,
    TYPE_EQUIPMENT,
    PRODUCER_COUNTRY,
    PRODUCER_COMPANY,
    ORDER_ONLINE,
    INSTALLMENTS,
    NAME_MODEL_LINE,
    NAME_MODEL;

    public static String getAttributeName(RegisterAttributes attribute) {
        String name = null;
        switch(attribute) {
            case ID: {
                name = "id";
                break;
            }
            case TYPE_EQUIPMENT: {
                name = "typeEquipment";
                break;
            }
            case PRODUCER_COUNTRY: {
                name = "producerCountry";
                break;
            }
            case PRODUCER_COMPANY: {
                name = "producerCompany";
                break;
            }
            case ORDER_ONLINE: {
                name = "orderOnline";
                break;
            }
            case INSTALLMENTS: {
                name = "installments";
                break;
            }
            case NAME_MODEL_LINE: {
                name = "nameModelLine";
                break;
            }
            case NAME_MODEL: {
                name = "nameModel";
                break;
            }
            default: {
                name = "id";
            }
        }
        return name;
    }
}
