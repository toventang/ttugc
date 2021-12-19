package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.api.h */
public final class C48334h {

    /* renamed from: a */
    private static volatile IFeedModuleService f112006a;

    static {
        Covode.recordClassIndex(57106);
    }

    /* renamed from: a */
    public static IFeedModuleService m91798a() {
        if (f112006a == null) {
            f112006a = FeedModuleServiceImpl.m91780a();
        }
        return f112006a;
    }

    /* renamed from: b */
    public static boolean m91799b() {
        return m91798a().canResumePlay();
    }
}
