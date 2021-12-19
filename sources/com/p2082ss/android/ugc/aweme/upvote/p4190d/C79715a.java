package com.p2082ss.android.ugc.aweme.upvote.p4190d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.upvote.d.a */
public final class C79715a {

    /* renamed from: a */
    public static final int f178870a = 30;

    /* renamed from: b */
    public static final C79715a f178871b = new C79715a();

    private C79715a() {
    }

    /* renamed from: a */
    public static int m138541a() {
        try {
            return SettingsManager.m29616a().mo25394a("social_upvote_cache_limit", 30);
        } catch (Throwable unused) {
            return f178870a;
        }
    }

    static {
        Covode.recordClassIndex(92936);
    }
}
