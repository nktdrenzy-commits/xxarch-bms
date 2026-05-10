package com.jianhua.fm.bom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.bom.entity.BomCalcFormula;
import com.jianhua.fm.bom.mapper.BomCalcFormulaMapper;
import com.jianhua.fm.bom.service.BomCalcFormulaService;
import org.springframework.stereotype.Service;

@Service
public class BomCalcFormulaServiceImpl extends ServiceImpl<BomCalcFormulaMapper, BomCalcFormula> implements BomCalcFormulaService {}
