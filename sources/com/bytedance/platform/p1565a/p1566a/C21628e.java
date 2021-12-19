package com.bytedance.platform.p1565a.p1566a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.platform.a.a.e */
public final class C21628e {

    /* renamed from: a */
    public static final Object[] f51316a = new Object[0];

    /* renamed from: b */
    public static final Class<?>[] f51317b = new Class[0];

    /* renamed from: c */
    private static final String f51318c = C21628e.class.getSimpleName();

    private C21628e() {
    }

    static {
        Covode.recordClassIndex(25269);
    }

    /* renamed from: b */
    public static Object[] m40581b(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return f51316a;
        }
        return objArr;
    }

    /* renamed from: a */
    public static Class<?>[] m40580a(Object... objArr) {
        Class<?> cls;
        if (objArr == null || objArr.length == 0) {
            return f51317b;
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
