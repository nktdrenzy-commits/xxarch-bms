package com.jianhua.fm.altlist.entity;

import lombok.Data;

@Data
public class AltMaterialItem {
    private Long id;
    private Long listId;
    private Long materialId;
    private String unit;
    private java.math.BigDecimal quantity;
}
