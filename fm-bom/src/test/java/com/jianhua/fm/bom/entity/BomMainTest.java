package com.jianhua.fm.bom.entity;

import com.jianhua.fm.common.entity.BaseEntity;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import static org.junit.jupiter.api.Assertions.*;

/**
 * BomMain 单元测试
 */
class BomMainTest {

    @Test
    void testBomMainHasCalcObjectId() throws Exception {
        Field field = BomMain.class.getDeclaredField("calcObjectId");
        assertNotNull(field);
    }

    @Test
    void testBomMainHasBomName() throws Exception {
        Field field = BomMain.class.getDeclaredField("bomName");
        assertNotNull(field);
    }

    @Test
    void testBomMainExtendsBaseEntity() {
        assertTrue(BaseEntity.class.isAssignableFrom(BomMain.class));
    }
}