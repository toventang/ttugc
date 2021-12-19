package com.facebook.internal.p1894a.p1896b;

import com.bytedance.covode.number.Covode;
import com.facebook.C24006ab;
import com.facebook.internal.p1894a.C24668a;
import com.facebook.internal.p1894a.C24673b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.internal.a.b.a */
public final class C24677a {

    /* renamed from: a */
    public static boolean f58610a = false;

    /* renamed from: b */
    private static final Set<Object> f58611b = Collections.newSetFromMap(new WeakHashMap());

    static {
        Covode.recordClassIndex(28830);
    }

    /* renamed from: a */
    public static boolean m47209a(Object obj) {
        return f58611b.contains(obj);
    }

    /* renamed from: a */
    public static void m47208a(Throwable th, Object obj) {
        if (f58610a) {
            f58611b.add(obj);
            if (C24006ab.m45407b()) {
                C24668a.m47197a(th);
                C24673b.C24675a.m47207a(th, C24673b.EnumC24676b.CrashShield).mo40503b();
            }
        }
    }
}
