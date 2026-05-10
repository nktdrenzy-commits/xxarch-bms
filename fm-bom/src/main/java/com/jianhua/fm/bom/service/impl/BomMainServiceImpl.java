package com.jianhua.fm.bom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.bom.entity.BomMain;
import com.jianhua.fm.bom.mapper.BomMainMapper;
import com.jianhua.fm.bom.service.BomMainService;
import org.springframework.stereotype.Service;

@Service
public class BomMainServiceImpl extends ServiceImpl<BomMainMapper, BomMain> implements BomMainService {}
