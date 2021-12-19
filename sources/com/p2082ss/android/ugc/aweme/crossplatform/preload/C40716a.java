package com.p2082ss.android.ugc.aweme.crossplatform.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.view.C40737c;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.preload.a */
public final class C40716a {

    /* renamed from: a */
    public static final C40716a f95329a = new C40716a();

    /* renamed from: b */
    private static Map<String, C40737c> f95330b = new LinkedHashMap();

    /* renamed from: c */
    private static Map<String, Integer> f95331c = new LinkedHashMap();

    private C40716a() {
    }

    static {
        Covode.recordClassIndex(48563);
    }

    /* renamed from: a */
    public static C40737c m82130a(String str) {
        C89219l.m154721d(str, "");
        return f95330b.get(str);
    }

    /* renamed from: b */
    public static void m82131b(String str) {
        C89219l.m154721d(str, "");
        f95330b.put(str, null);
        f95331c.remove(str);
    }
}
