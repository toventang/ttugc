package com.p2082ss.android.ugc.aweme.commercialize.abtest;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38249p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.abtest.b */
public final class C37587b {

    /* renamed from: a */
    public static final C38249p f88832a = C38249p.DEFAULT_DISABLE_VERSION;

    /* renamed from: b */
    public static final C37587b f88833b = new C37587b();

    /* renamed from: c */
    private static final C38249p f88834c = C38249p.DEFAULT_ONLINE_VERSION;

    /* renamed from: d */
    private static final C38249p f88835d = C38249p.DEFAULT_TEST_VERSION;

    private C37587b() {
    }

    static {
        Covode.recordClassIndex(45001);
    }

    /* renamed from: a */
    public static final C38249p m75844a() {
        try {
            Object a = C16048b.m29633a().mo25415a(true, "aweme_ad_rank", C38249p.class);
            C89219l.m154716b(a, "");
            return (C38249p) a;
        } catch (Throwable unused) {
            return f88832a;
        }
    }
}
