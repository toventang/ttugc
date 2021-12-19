package com.bytedance.platform.godzilla.p1586d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.godzilla.d.b */
public final class C21723b {

    /* renamed from: a */
    public static final Object[] f51492a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f51493b = new Class[0];

    /* renamed from: c */
    private static final String f51494c = C21723b.class.getSimpleName();

    private C21723b() {
    }

    static {
        Covode.recordClassIndex(25364);
    }

    /* renamed from: b */
    public static Object[] m40686b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f51492a;
        }
        return objArr;
    }

    /* renamed from: a */
    public static Class<?>[] m40685a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f51493b;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] == null) {
                cls = null;
            } else {
                cls = objArr[i].getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }
}
