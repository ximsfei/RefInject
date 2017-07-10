package com.ximsfei.refinject;

import java.lang.reflect.Field;

public class RefStaticLong {
    private Field field;

    public RefStaticLong(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public long get() {
        try {
            return this.field.getLong(null);
        } catch (Exception e) {
            return 0;
        }
    }

    public void set(long value) {
        try {
            this.field.setLong(null, value);
        } catch (Exception e) {
            //Ignore
        }
    }
}