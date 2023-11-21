package com.pz.frontend.table;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import com.pz.frontend.dto.ItemDto;

public class ItemTableModel {

    private final Long idItem;
    private final SimpleStringProperty name;
    private final SimpleDoubleProperty quantity;
    private final SimpleStringProperty quantityType;

    public ItemTableModel(Long idItem, String name, Double quantity, String quantityType){
        this.idItem = idItem;
        this.name = new SimpleStringProperty(name);
        this.quantity = new SimpleDoubleProperty(quantity);
        this.quantityType = new SimpleStringProperty(quantityType);
    }

    public static ItemTableModel of(ItemDto dto){
        return new ItemTableModel(dto.getIdItem(), dto.getName(), dto.getQuantity(), dto.getQuantityType());
    }

    public Long getIdItem() {
        return idItem;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public double getQuantity() {
        return quantity.get();
    }

    public SimpleDoubleProperty quantityProperty() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity.set(quantity);
    }

    public String getQuantityType() {
        return quantityType.get();
    }

    public SimpleStringProperty quantityTypeProperty() {
        return quantityType;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType.set(quantityType);
    }
}
