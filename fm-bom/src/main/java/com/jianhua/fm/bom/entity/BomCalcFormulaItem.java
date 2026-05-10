package com.jianhua.fm.bom.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 计算公式适用物料（表体）
 */
@Data
@TableName("bom_calc_formula_item")
public class BomCalcFormulaItem {

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关联公式ID
     */
    private Long formulaId;

    /**
     * 适用物料ID
     */
    private Long materialId;
}