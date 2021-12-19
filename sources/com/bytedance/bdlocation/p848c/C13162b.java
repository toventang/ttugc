package com.bytedance.bdlocation.p848c;

import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.bdlocation.c.b */
public final class C13162b {

    /* renamed from: a */
    private static final Map<Class<?>, AbstractC13163c> f32097a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final C13161a f32098b;

    static {
        Covode.recordClassIndex(15109);
        C13161a aVar = new C13161a();
        f32098b = aVar;
        aVar.f32096a = C13153b.f32045d;
        m23682a(aVar);
    }

    /* renamed from: a */
    public static void m23683a(String str) {
        m23688b("BDLocation", str);
    }

    /* renamed from: b */
    public static void m23687b(String str) {
        m23690d("BDLocation", str);
    }

    /* renamed from: a */
    public static void m23682a(AbstractC13163c cVar) {
        if (cVar != null) {
            Map<Class<?>, AbstractC13163c> map = f32097a;
            if (!map.containsKey(cVar.getClass())) {
                map.put(cVar.getClass(), cVar);
            }
        }
    }

    /* renamed from: a */
    public static void m23684a(String str, String str2) {
        m23688b(str, str2);
    }

    /* renamed from: c */
    public static void m23689c(String str, String str2) {
        m23690d(str, str2);
    }

    /* renamed from: e */
    public static void m23691e(String str, String str2) {
        m23685a(str, str2, null);
    }

    /* renamed from: a */
    public static void m23686a(String str, Throwable th) {
        m23685a("BDLocation", str, th);
    }

    /* renamed from: b */
    public static void m23688b(String str, String str2) {
        for (Map.Entry<Class<?>, AbstractC13163c> entry : f32097a.entrySet()) {
            entry.getValue().mo21272b(str, str2);
        }
    }

    /* renamed from: d */
    public static void m23690d(String str, String str2) {
        for (Map.Entry<Class<?>, AbstractC13163c> entry : f32097a.entrySet()) {
            entry.getValue().mo21270a(str, str2);
        }
    }

    /* renamed from: a */
    public static void m23685a(String str, String str2, Throwable th) {
        for (Map.Entry<Class<?>, AbstractC13163c> entry : f32097a.entrySet()) {
            entry.getValue().mo21271a(str, str2, th);
        }
    }
}
