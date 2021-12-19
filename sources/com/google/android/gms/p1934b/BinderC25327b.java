package com.google.android.gms.p1934b;

import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.p1934b.AbstractC25324a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.b.b */
public final class BinderC25327b<T> extends AbstractC25324a.AbstractBinderC25325a {

    /* renamed from: a */
    private final T f60064a;

    static {
        Covode.recordClassIndex(30717);
    }

    private BinderC25327b(T t) {
        this.f60064a = t;
    }

    /* renamed from: a */
    public static <T> AbstractC25324a m48694a(T t) {
        return new BinderC25327b(t);
    }

    /* renamed from: a */
    public static <T> T m48695a(AbstractC25324a aVar) {
        if (aVar instanceof BinderC25327b) {
            return ((BinderC25327b) aVar).f60064a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(new StringBuilder(64).append("Unexpected number of IObjectWrapper declared fields: ").append(declaredFields.length).toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
