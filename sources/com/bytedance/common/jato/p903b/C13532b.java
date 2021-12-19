package com.bytedance.common.jato.p903b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

/* renamed from: com.bytedance.common.jato.b.b */
public final class C13532b {

    /* renamed from: a */
    private static int f32933a = -1;

    /* renamed from: b */
    private static int f32934b = -1;

    /* renamed from: c */
    private static final String f32935c = System.getProperty("java.vm.version", "");

    static {
        Covode.recordClassIndex(15542);
    }

    /* renamed from: c */
    public static boolean m24311c() {
        try {
            String str = f32935c;
            if (str == null || str.length() <= 0 || Integer.parseInt(String.valueOf(str.charAt(0))) >= 2) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized boolean m24309a() {
        synchronized (C13532b.class) {
            MethodCollector.m26663i(9004);
            int i = f32933a;
            if (i == -1) {
                if (new File("/system/lib/arm/nb/libc.so").exists()) {
                    f32933a = 1;
                } else {
                    f32933a = 0;
                }
                if (f32933a > 0) {
                    MethodCollector.m26664o(9004);
                    return true;
                }
                MethodCollector.m26664o(9004);
                return false;
            } else if (i > 0) {
                MethodCollector.m26664o(9004);
                return true;
            } else {
                MethodCollector.m26664o(9004);
                return false;
            }
        }
    }

    /* renamed from: b */
    public static synchronized boolean m24310b() {
        synchronized (C13532b.class) {
            MethodCollector.m26663i(9161);
            int i = f32934b;
            if (i == -1) {
                try {
                    if (m24308a("ro.kernel.qemu").equals("1")) {
                        f32934b = 1;
                    } else {
                        f32934b = 0;
                    }
                } catch (Throwable unused) {
                    f32934b = 0;
                }
                if (f32934b > 0) {
                    MethodCollector.m26664o(9161);
                    return true;
                }
                MethodCollector.m26664o(9161);
                return false;
            } else if (i > 0) {
                MethodCollector.m26664o(9161);
                return true;
            } else {
                MethodCollector.m26664o(9161);
                return false;
            }
        }
    }

    /* renamed from: a */
    private static synchronized String m24308a(String str) {
        String str2;
        synchronized (C13532b.class) {
            MethodCollector.m26663i(9303);
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str2 = (String) cls.getDeclaredMethod("get", String.class).invoke(cls, str);
            MethodCollector.m26664o(9303);
        }
        return str2;
    }
}
