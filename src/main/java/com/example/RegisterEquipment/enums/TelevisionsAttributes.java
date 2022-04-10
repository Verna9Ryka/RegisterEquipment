package com.example.RegisterEquipment.enums;

public enum TelevisionsAttributes {
    ID,
    NAME,
    SERIAL_NUMBER,
    COLOR,
    SIZE,
    COST,
    IN_STOCK,
    CATEGORY,
    TECHNOLOGY;

    public static String getAttributeName(TelevisionsAttributes attribute) {
        String name = null;
        switch(attribute) {
            case ID: {
                name = "id";
                break;
            }
            case NAME: {
                name = "name";
                break;
            }
            case SERIAL_NUMBER: {
                name = "serialNumber";
                break;
            }
            case COLOR: {
                name = "color";
                break;
            }
            case SIZE: {
                name = "size";
                break;
            }
            case COST: {
                name = "cost";
                break;
            }
            case IN_STOCK: {
                name = "inStock";
                break;
            }
            case CATEGORY: {
                name = "category";
                break;
            }
            case TECHNOLOGY: {
                name = "technology";
                break;
            }
            default: {
                name = "id";
            }
        }
        return name;
    }
}
