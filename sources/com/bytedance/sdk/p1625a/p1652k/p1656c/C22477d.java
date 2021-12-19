package com.bytedance.sdk.p1625a.p1652k.p1656c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1652k.p1653a.AbstractC22467d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.a.k.c.d */
public final class C22477d {

    /* renamed from: a */
    public static Context f53135a;

    /* renamed from: b */
    private static Map<Class, AbstractC22467d> f53136b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26293);
    }

    /* renamed from: a */
    public static <T extends AbstractC22467d> T m42420a(Class<T> cls) {
        return (T) f53136b.get(cls);
    }

    /* renamed from: a */
    public static <T extends AbstractC22467d> void m42421a(Class<T> cls, AbstractC22467d dVar) {
        if (dVar != null) {
            f53136b.put(cls, dVar);
        }
    }
}
