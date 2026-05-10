package com.jianhua.fm.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.basic.entity.BasMaterial;
import com.jianhua.fm.basic.mapper.BasMaterialMapper;
import com.jianhua.fm.basic.service.BasMaterialService;
import org.springframework.stereotype.Service;

@Service
public class BasMaterialServiceImpl extends ServiceImpl<BasMaterialMapper, BasMaterial> implements BasMaterialService {
}
