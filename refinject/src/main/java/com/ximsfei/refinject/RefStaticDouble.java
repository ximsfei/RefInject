package com.ximsfei.refinject;

import java.lang.reflect.Field;

public class RefStaticDouble {
    private Field field;

    public RefStaticDouble(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public double get() {
        try {
            return this.field.getDouble(null);
        } catch (Exception e) {
            return 0;
        }
    }

    public void set(double value) {
        try {
            this.field.setDouble(null, value);
        } catch (Exception e) {
            //Ignore
        }
    }
}