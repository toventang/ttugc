package com.google.p1998c.p2005g;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27245k;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.google.c.g.d */
public abstract class AbstractC27567d<T> {
    static {
        Covode.recordClassIndex(33147);
    }

    AbstractC27567d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Type mo46136a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        C27245k.m54240a(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
