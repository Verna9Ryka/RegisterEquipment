package com.example.RegisterEquipment.enums;

public enum SmartphonesAttributes {
    ID,
    NAME,
    SERIAL_NUMBER,
    COLOR,
    SIZE,
    COST,
    IN_STOCK,
    MEMORY,
    NUMBER_CAMERAS;

    public static String getAttributeName(SmartphonesAttributes attribute) {
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
            case MEMORY: {
                name = "memory";
                break;
            }
            case NUMBER_CAMERAS: {
                name = "numberCameras";
                break;
            }
            default: {
                name = "id";
            }
        }
        return name;
    }
}
