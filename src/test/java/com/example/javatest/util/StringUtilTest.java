package com.example.javatest.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void string_with_spaces_is_empty(){
        assertTrue(StringUtil.isEmpty("     "));
    }
    @Test
    public void string_is_not_empty(){
        assertFalse(StringUtil.isEmpty("gfdg"));
    }

    @Test
    public void string_null_is_empty(){
        assertTrue(StringUtil.isEmpty(null));
    }

}