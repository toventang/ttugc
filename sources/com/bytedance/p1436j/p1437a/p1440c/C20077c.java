package com.bytedance.p1436j.p1437a.p1440c;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28818l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.c.c */
public final class C20077c {

    /* renamed from: a */
    public static final Map<String, C28818l> f47794a = new ConcurrentHashMap(3);

    /* renamed from: b */
    public static final Map<String, Integer> f47795b = new LinkedHashMap();

    /* renamed from: c */
    public static final C20077c f47796c = new C20077c();

    private C20077c() {
    }

    static {
        Covode.recordClassIndex(23585);
    }

    /* renamed from: a */
    private static void m38031a(String str) {
        Map<String, Integer> map = f47795b;
        int i = map.get(str);
        if (i == null) {
            i = 0;
            map.put(str, 0);
        }
        map.put(str, Integer.valueOf(i.intValue() + 1));
    }

    /* renamed from: a */
    public static C28818l m38030a(String str, String[] strArr, boolean z) {
        C89219l.m154719c(str, "");
        Map<String, C28818l> map = f47794a;
        C28818l lVar = map.get(str);
        m38031a(str);
        if (lVar != null) {
            return lVar;
        }
        C28818l a = C28818l.m57691a(str, strArr, z);
        C89219l.m154709a((Object) a, "");
        map.put(str, a);
        return a;
    }
}
