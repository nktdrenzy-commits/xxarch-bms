package com.jianhua.fm.system.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

/**
 * SysOrg 单元测试
 */
class SysOrgTest {

    @Test
    void testSysOrgHasOrgCode() throws Exception {
        Field field = SysOrg.class.getDeclaredField("orgCode");
        assertNotNull(field);
    }

    @Test
    void testSysOrgExtendsBaseEntity() {
        assertTrue(BaseEntity.class.isAssignableFrom(SysOrg.class));
    }
}