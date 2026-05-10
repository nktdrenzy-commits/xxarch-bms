package com.jianhua.fm.bom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.bom.entity.BomCalcObject;
import com.jianhua.fm.bom.mapper.BomCalcObjectMapper;
import com.jianhua.fm.bom.service.BomCalcObjectService;
import org.springframework.stereotype.Service;

@Service
public class BomCalcObjectServiceImpl extends ServiceImpl<BomCalcObjectMapper, BomCalcObject> implements BomCalcObjectService {}
