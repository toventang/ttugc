package com.bytedance.platform.p1565a.p1566a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.platform.a.a.a */
public final class C21624a {

    /* renamed from: a */
    private static Class f51310a;

    /* renamed from: b */
    private static Field f51311b;

    /* renamed from: c */
    private static Object f51312c;

    /* renamed from: d */
    private static Object f51313d;

    /* renamed from: e */
    private static Set<Integer> f51314e;

    /* renamed from: a */
    public static synchronized Object m40571a() {
        Object obj;
        synchronized (C21624a.class) {
            MethodCollector.m26663i(6396);
            try {
                if (f51312c == null) {
                    f51312c = C21633h.m40584a(m40573c(), "currentActivityThread", new Object[0]);
                }
                obj = f51312c;
                MethodCollector.m26664o(6396);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                MethodCollector.m26664o(6396);
                return null;
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static synchronized Object m40572b() {
        Object obj;
        synchronized (C21624a.class) {
            MethodCollector.m26663i(6535);
            if (f51313d == null) {
                try {
                    f51313d = m40574d().get(m40571a());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            obj = f51313d;
            MethodCollector.m26664o(6535);
        }
        return obj;
    }

    /* renamed from: c */
    private static synchronized Class m40573c() {
        Class cls;
        synchronized (C21624a.class) {
            MethodCollector.m26663i(6082);
            if (f51310a == null) {
                try {
                    f51310a = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            cls = f51310a;
            MethodCollector.m26664o(6082);
        }
        return cls;
    }

    /* renamed from: d */
    private static synchronized Field m40574d() {
        Field field;
        synchronized (C21624a.class) {
            MethodCollector.m26663i(6231);
            if (f51311b == null) {
                f51311b = C21627d.m40579a(m40573c(), "mH");
            }
            field = f51311b;
            MethodCollector.m26664o(6231);
        }
        return field;
    }

    static {
        Covode.recordClassIndex(25265);
        HashSet hashSet = new HashSet();
        f51314e = hashSet;
        hashSet.add(113);
        f51314e.add(114);
        f51314e.add(115);
        f51314e.add(116);
        f51314e.add(121);
        f51314e.add(122);
        f51314e.add(100);
        f51314e.add(159);
        f51314e.add(123);
    }
}
