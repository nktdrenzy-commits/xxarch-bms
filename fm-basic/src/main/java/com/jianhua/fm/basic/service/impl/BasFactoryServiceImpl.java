package com.jianhua.fm.basic.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.basic.entity.BasFactory;
import com.jianhua.fm.basic.mapper.BasFactoryMapper;
import com.jianhua.fm.basic.service.BasFactoryService;
import org.springframework.stereotype.Service;

@Service
public class BasFactoryServiceImpl extends ServiceImpl<BasFactoryMapper, BasFactory> implements BasFactoryService {
}
