package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.utils.dh */
public final class C80343dh {

    /* renamed from: a */
    static boolean f179873a = false;

    /* renamed from: b */
    private static Map<String, Field> f179874b = new HashMap();

    /* renamed from: c */
    private static Map<String, Method> f179875c = new HashMap();

    /* renamed from: d */
    private static Map<String, Constructor> f179876d = new HashMap();

    static {
        Covode.recordClassIndex(93611);
    }

    /* renamed from: a */
    static <T> void m139304a(T t, String str) {
        if (t == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static Field m139303a(Class<?> cls, String str) {
        Field field;
        MethodCollector.m26663i(4054);
        m139304a((Object) cls, "The class must not be null !!!");
        if (!TextUtils.isEmpty(str)) {
            String str2 = cls.getName() + "#" + str;
            synchronized (f179874b) {
                try {
                    field = f179874b.get(str2);
                } finally {
                    MethodCollector.m26664o(4054);
                }
            }
            if (field != null) {
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (declaredField != null && !declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                if (declaredField != null) {
                    synchronized (f179874b) {
                        try {
                            f179874b.put(str2, declaredField);
                        } finally {
                            MethodCollector.m26664o(4054);
                        }
                    }
                }
                return declaredField;
            } catch (Throwable unused) {
                MethodCollector.m26664o(4054);
                return null;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("The field name must not be blank !!!");
            MethodCollector.m26664o(4054);
            throw illegalArgumentException;
        }
    }
}
