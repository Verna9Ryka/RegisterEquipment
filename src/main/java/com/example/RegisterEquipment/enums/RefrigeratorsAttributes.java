package com.example.RegisterEquipment.enums;

public enum RefrigeratorsAttributes {
    ID,
    NAME,
    SERIAL_NUMBER,
    COLOR,
    SIZE,
    COST,
    IN_STOCK,
    NUMBER_DOORS,
    TYPE_COMPRESSOR;

    public static String getAttributeName(RefrigeratorsAttributes attribute) {
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
            case NUMBER_DOORS: {
                name = "numberDoors";
                break;
            }
            case TYPE_COMPRESSOR: {
                name = "typeCompressor";
                break;
            }
            default: {
                name = "id";
            }
        }
        return name;
    }
}
