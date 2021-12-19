package com.bytedance.monitor.p1546a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.monitor.a.f */
public final class C21459f {

    /* renamed from: a */
    static final Object[] f50867a = new Object[0];

    /* renamed from: b */
    static final Class<?>[] f50868b = new Class[0];

    static {
        Covode.recordClassIndex(25082);
    }

    /* renamed from: b */
    static Object[] m40312b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f50867a;
        }
        return objArr;
    }

    /* renamed from: a */
    static Class<?>[] m40311a(Object... objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return f50868b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i] == null ? null : objArr[i].getClass();
        }
        return clsArr;
    }
}
