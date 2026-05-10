package com.jianhua.fm.common.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * R 单元测试
 */
class RTest {

    @Test
    void testOk() {
        R result = R.ok();
        assertNotNull(result);
        assertEquals(0, result.get("code"));
    }

    @Test
    void testOkWithData() {
        R result = R.ok("testData");
        assertNotNull(result);
        assertEquals("testData", result.get("data"));
    }

    @Test
    void testFail() {
        R result = R.fail("error msg");
        assertNotNull(result);
        assertEquals(500, result.get("code"));
        assertEquals("error msg", result.get("msg"));
    }

    @Test
    void testFailWithCode() {
        R result = R.fail(400, "bad request");
        assertEquals(400, result.get("code"));
        assertEquals("bad request", result.get("msg"));
    }
}