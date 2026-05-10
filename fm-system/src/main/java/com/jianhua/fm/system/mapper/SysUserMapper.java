package com.jianhua.fm.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jianhua.fm.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Mapper
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}