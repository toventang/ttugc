package com.bytedance.android.livesdk.service.p625c.p631f;

import com.bytedance.android.livesdk.util.C11116a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.service.c.f.e */
public final class C10751e {

    /* renamed from: a */
    public static final C10751e f25906a = new C10751e();

    private C10751e() {
    }

    static {
        Covode.recordClassIndex(12348);
    }

    /* renamed from: a */
    public static Map<String, String> m19341a(String str) {
        if (str == null) {
            return new HashMap();
        }
        Map map = (Map) C11116a.m19746a(str, (Type) Map.class);
        if (map == null) {
            map = new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() instanceof Double) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Long l = null;
                if (!(value instanceof Double)) {
                    value = null;
                }
                Double d = (Double) value;
                if (d != null) {
                    l = Long.valueOf((long) d.doubleValue());
                }
                hashMap.put(key, String.valueOf(l));
            } else {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }
}
