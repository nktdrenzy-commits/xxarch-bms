package com.jianhua.fm.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.system.entity.SysUser;
import com.jianhua.fm.system.mapper.SysUserMapper;
import com.jianhua.fm.system.service.SysUserService;
import org.springframework.stereotype.Service;

/**
 * 用户Service实现
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}