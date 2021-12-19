package com.p2082ss.android.p2203ug.bus;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ug.bus.b */
public final class C30980b {

    /* renamed from: a */
    private static Map<Class, AbstractC30973a> f74261a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(37607);
    }

    /* renamed from: a */
    public static <T extends AbstractC30973a> T m63694a(Class<T> cls) {
        return (T) f74261a.get(cls);
    }

    /* renamed from: a */
    public static <T extends AbstractC30973a> void m63695a(Class<T> cls, AbstractC30973a aVar) {
        if (aVar != null) {
            f74261a.put(cls, aVar);
        }
    }
}
