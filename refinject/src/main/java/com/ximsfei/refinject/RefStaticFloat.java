package com.ximsfei.refinject;

import java.lang.reflect.Field;

public class RefStaticFloat {
    private Field field;

    public RefStaticFloat(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public float get() {
        try {
            return this.field.getFloat(null);
        } catch (Exception e) {
            return 0;
        }
    }

    public void set(float value) {
        try {
            this.field.setFloat(null, value);
        } catch (Exception e) {
            //Ignore
        }
    }
}