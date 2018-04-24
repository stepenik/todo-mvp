package com.todo.util;

public class StringUtilsImpl implements StringUtils {

    private static final String EMPTY = "";

    public boolean isEmpty(final String string) {
        return string == null || EMPTY.equals(string);
    }

    public boolean isNotEmpty(final String string) {
        return !isEmpty(string);
    }


}
