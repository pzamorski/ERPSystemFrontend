package com.pz.frontend.dto;

import lombok.Data;

import java.util.List;

@Data
public class ItemEditViewDto {

    private Long idItem;
    private String name;
    private Double quantity;
    private Long idQuantityType;
    private List<QuantityTypeDto> quantityTypeDtoList;
}
