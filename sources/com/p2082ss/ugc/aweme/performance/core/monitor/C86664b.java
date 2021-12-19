package com.p2082ss.ugc.aweme.performance.core.monitor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86667c;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.b */
public final class C86664b {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C86667c> f195333a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static ConcurrentHashMap<String, Integer> f195334b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static int f195335c = 1;

    /* renamed from: d */
    public static final C86664b f195336d = new C86664b();

    private C86664b() {
    }

    static {
        Covode.recordClassIndex(101892);
    }

    /* renamed from: a */
    public static C86667c m150143a(String str) {
        C89219l.m154719c(str, "");
        return f195333a.get(str);
    }
}
