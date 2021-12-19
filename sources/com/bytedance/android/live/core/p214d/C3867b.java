package com.bytedance.android.live.core.p214d;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.d.b */
public final class C3867b {

    /* renamed from: a */
    public static final Map<String, Long> f10690a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final List<String> f10691b = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(4396);
    }

    /* renamed from: b */
    public static void m9483b(String str) {
        m9481a(m9479a(str, false), System.currentTimeMillis());
    }

    /* renamed from: a */
    public static void m9480a(String str) {
        m9481a(m9479a(str, true), System.currentTimeMillis());
        f10691b.add(str);
    }

    /* renamed from: a */
    public static long m9478a(Map<String, Long> map, String str) {
        Long l = map.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* renamed from: a */
    public static String m9479a(String str, boolean z) {
        if (z) {
            return str + "_start";
        }
        return str + "_end";
    }

    /* renamed from: a */
    private static void m9481a(String str, long j) {
        f10690a.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m9482a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
    }
}
