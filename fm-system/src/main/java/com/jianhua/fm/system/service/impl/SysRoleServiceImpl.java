package com.jianhua.fm.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jianhua.fm.system.entity.SysRole;
import com.jianhua.fm.system.mapper.SysRoleMapper;
import com.jianhua.fm.system.service.SysRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色Service实现
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {
}