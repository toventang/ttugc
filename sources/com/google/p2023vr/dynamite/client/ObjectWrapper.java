package com.google.p2023vr.dynamite.client;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.google.vr.dynamite.client.ObjectWrapper */
public final class ObjectWrapper<T> extends BinderC28047c {
    private final T wrappedObject;

    static {
        Covode.recordClassIndex(33702);
    }

    private ObjectWrapper(T t) {
        this.wrappedObject = t;
    }

    /* renamed from: a */
    public static <T> IObjectWrapper m56152a(T t) {
        return new ObjectWrapper(t);
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i++;
        }
        if (field == null) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                Object obj = field.get(asBinder);
                if (obj == null) {
                    return null;
                }
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
                throw new IllegalArgumentException("remoteBinder is the wrong class.");
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
            }
        } else {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
