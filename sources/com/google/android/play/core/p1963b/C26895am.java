package com.google.android.play.core.p1963b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;

/* renamed from: com.google.android.play.core.b.am */
public final class C26895am<T> {

    /* renamed from: a */
    public final Field f63787a;

    /* renamed from: b */
    private final Object f63788b;

    /* renamed from: c */
    private final Class<T> f63789c;

    static {
        Covode.recordClassIndex(32370);
    }

    C26895am(Object obj, Field field, Class<T> cls) {
        this.f63788b = obj;
        this.f63787a = field;
        this.f63789c = cls;
    }

    C26895am(Object obj, Field field, Class cls, byte b) {
        this(obj, field, Array.newInstance(cls, 0).getClass());
    }

    /* renamed from: b */
    private Class m53403b() {
        return this.f63787a.getType().getComponentType();
    }

    /* renamed from: a */
    public final T mo44569a() {
        try {
            return this.f63789c.cast(this.f63787a.get(this.f63788b));
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to get value of field %s of type %s on object of type %s", new Object[]{this.f63787a.getName(), this.f63788b.getClass().getName(), this.f63789c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo44570a(T t) {
        try {
            this.f63787a.set(this.f63788b, t);
        } catch (Exception e) {
            throw new C26897ao(C1764a.m5928a("Failed to set value of field %s of type %s on object of type %s", new Object[]{this.f63787a.getName(), this.f63788b.getClass().getName(), this.f63789c.getName()}), e);
        }
    }

    /* renamed from: a */
    public final void mo44571a(Collection collection) {
        Object[] objArr = (Object[]) mo44569a();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(m53403b(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        mo44570a(objArr2);
    }

    /* renamed from: b */
    public final void mo44572b(Collection collection) {
        Object[] objArr = (Object[]) mo44569a();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(m53403b(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        mo44570a(objArr2);
    }
}
