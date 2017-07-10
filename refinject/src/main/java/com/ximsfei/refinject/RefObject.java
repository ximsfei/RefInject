package com.ximsfei.refinject;

import java.lang.reflect.Field;

@SuppressWarnings("unchecked")
public class RefObject<T> {
    private Field field;

    public RefObject(Class<?> cls, Field field) throws NoSuchFieldException {
        this.field = cls.getDeclaredField(field.getName());
        this.field.setAccessible(true);
    }

    public T get(Object object) {
        try {
            return (T) this.field.get(object);
        } catch (Exception e) {
            return null;
        }
    }

    public void set(Object obj, T value) {
        try {
            this.field.set(obj, value);
        } catch (Exception e) {
            //Ignore
        }
    }

    public T get() {
        T obj = null;
        try {
            obj = (T) this.field.get(null);
        } catch (Exception e) {
            //Ignore
        }
        return obj;
    }

    public void set(T obj) {
        try {
            this.field.set(null, obj);
        } catch (Exception e) {
            //Ignore
        }
    }
}