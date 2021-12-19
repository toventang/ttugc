package com.bytedance.p1781y;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.y.a */
public final class C23707a {

    /* renamed from: a */
    public static String f56058a = "cn-north-1";

    /* renamed from: b */
    public static String f56059b = "us-east-1";

    /* renamed from: c */
    public static String f56060c = "ap-singapore-1";

    /* renamed from: d */
    static String f56061d = "/vod/settings/v1";

    /* renamed from: e */
    public static String f56062e;

    /* renamed from: f */
    public static String f56063f;

    /* renamed from: g */
    public static String f56064g;

    /* renamed from: h */
    public static String f56065h;

    /* renamed from: i */
    public static Map<String, Object> f56066i;

    /* renamed from: j */
    public static Map<String, Object> f56067j;

    /* renamed from: a */
    public static Map<String, String> m44797a() {
        return m44798a(f56066i);
    }

    /* renamed from: b */
    public static Map<String, String> m44799b() {
        return m44798a(f56067j);
    }

    static {
        Covode.recordClassIndex(27812);
    }

    /* renamed from: a */
    private static Map<String, String> m44798a(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
