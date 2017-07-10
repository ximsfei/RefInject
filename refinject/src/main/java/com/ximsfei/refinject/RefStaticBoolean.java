package com.ximsfei.refinject;

import java.lang.reflect.Field;

public class RefStaticBoolean {
    private Field field;

    public RefStaticBoolean(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public boolean get() {
        try {
            return this.field.getBoolean(null);
        } catch (Exception e) {
            return false;
        }
    }

    public void set(boolean value) {
        try {
            this.field.setBoolean(null, value);
        } catch (Exception e) {
            //Ignore
        }
    }
}