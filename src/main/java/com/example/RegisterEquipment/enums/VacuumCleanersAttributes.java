package com.example.RegisterEquipment.enums;

public enum VacuumCleanersAttributes {
    ID,
    NAME,
    SERIAL_NUMBER,
    COLOR,
    SIZE,
    COST,
    IN_STOCK,
    VOLUME_DUST_COLLECTOR,
    NUMBER_MODES;

    public static String getAttributeName(VacuumCleanersAttributes attribute) {
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
            case VOLUME_DUST_COLLECTOR: {
                name = "volumeDustCollector";
                break;
            }
            case NUMBER_MODES: {
                name = "numberModes";
                break;
            }
            default: {
                name = "id";
            }
        }
        return name;
    }
}
