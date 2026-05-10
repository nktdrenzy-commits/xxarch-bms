package com.jianhua.fm.bom.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.bom.entity.BomItem;
import com.jianhua.fm.bom.mapper.BomItemMapper;
import com.jianhua.fm.bom.service.BomItemService;
import org.springframework.stereotype.Service;

@Service
public class BomItemServiceImpl extends ServiceImpl<BomItemMapper, BomItem> implements BomItemService {}
