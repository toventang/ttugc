package com.p2082ss.android.ugc.aweme.notice.repo.p3515a;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.a.b */
public final class C61616b {

    /* renamed from: a */
    public static final C61616b f139822a = new C61616b();

    /* renamed from: b */
    private static final Map<String, C61615a> f139823b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map<String, C61615a> f139824c = new LinkedHashMap();

    private C61616b() {
    }

    static {
        Covode.recordClassIndex(72310);
    }

    /* renamed from: a */
    public static C61615a m111627a(String str) {
        C89219l.m154721d(str, "");
        return f139823b.get(str);
    }

    /* renamed from: b */
    public static C61615a m111629b(String str) {
        C89219l.m154721d(str, "");
        return f139824c.get(str);
    }

    /* renamed from: a */
    public static void m111628a(String str, C61615a aVar) {
        C89219l.m154721d(str, "");
        f139823b.put(str, aVar);
    }

    /* renamed from: b */
    public static void m111630b(String str, C61615a aVar) {
        C89219l.m154721d(str, "");
        f139824c.put(str, aVar);
    }
}
