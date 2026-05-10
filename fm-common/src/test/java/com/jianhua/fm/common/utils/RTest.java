package com.jianhua.fm.common.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * R 单元测试
 */
class RTest {

    @Test
    void testOk() {
        R<?> result = R.ok();
        assertNotNull(result);
        assertEquals(200, result.getCode());
    }

    @Test
    void testOkWithData() {
        R<String> result = R.ok("testData");
        assertNotNull(result);
        assertEquals("testData", result.getData());
    }

    @Test
    void testFail() {
        R<?> result = R.fail("error msg");
        assertNotNull(result);
        assertEquals(500, result.getCode());
        assertEquals("error msg", result.getMessage());
    }

    @Test
    void testFailWithCode() {
        R<?> result = R.fail(400, "bad request");
        assertEquals(400, result.getCode());
        assertEquals("bad request", result.getMessage());
    }

    @Test
    void testTimestamp() {
        R<?> result = R.ok();
        assertTrue(result.getTimestamp() > 0);
    }
}