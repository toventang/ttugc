package com.bytedance.ies.ugc.network.partner.p1275a;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.a.a */
public final class C18184a {

    /* renamed from: a */
    public long f43323a;

    /* renamed from: b */
    public long f43324b;

    /* renamed from: c */
    public final HashMap<String, Long> f43325c = new HashMap<>();

    /* renamed from: d */
    public final HashMap<String, Long> f43326d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, Long> f43327e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, Long> f43328f = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, Long> f43329g = new HashMap<>();

    static {
        Covode.recordClassIndex(20840);
    }

    /* renamed from: a */
    public static long m33824a(long j, Long l) {
        if (l == null) {
            return j;
        }
        l.longValue();
        return j + l.longValue();
    }

    /* renamed from: a */
    public final void mo29033a(String str, long j) {
        C89219l.m154721d(str, "");
        HashMap<String, Long> hashMap = this.f43328f;
        hashMap.put(str, Long.valueOf(m33824a(j, hashMap.get(str))));
    }

    /* renamed from: a */
    public static HashMap<String, Long> m33825a(HashMap<String, Long> hashMap, HashMap<String, Long> hashMap2) {
        C89219l.m154721d(hashMap, "");
        for (Map.Entry<String, Long> entry : hashMap2.entrySet()) {
            hashMap.put(entry.getKey(), Long.valueOf(m33824a(entry.getValue().longValue(), hashMap.get(entry.getKey()))));
        }
        return hashMap;
    }
}
