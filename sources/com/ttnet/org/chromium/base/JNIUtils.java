package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class JNIUtils {

    /* renamed from: a */
    static final /* synthetic */ boolean f198268a = true;

    /* renamed from: b */
    private static Boolean f198269b;

    /* renamed from: c */
    private static ClassLoader f198270c;

    static {
        Covode.recordClassIndex(103347);
    }

    public static Object getClassLoader() {
        ClassLoader classLoader = f198270c;
        if (classLoader == null) {
            return JNIUtils.class.getClassLoader();
        }
        return classLoader;
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (f198269b == null) {
            f198269b = false;
        }
        return f198269b.booleanValue();
    }
}
