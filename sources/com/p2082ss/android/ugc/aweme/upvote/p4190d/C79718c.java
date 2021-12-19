package com.p2082ss.android.ugc.aweme.upvote.p4190d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.upvote.d.c */
public final class C79718c {

    /* renamed from: a */
    public static final int f178876a = 50;

    /* renamed from: b */
    public static final C79718c f178877b = new C79718c();

    private C79718c() {
    }

    /* renamed from: a */
    public static int m138543a() {
        try {
            return SettingsManager.m29616a().mo25394a("social_upvote_publish_cache_limit", 50);
        } catch (Throwable unused) {
            return f178876a;
        }
    }

    static {
        Covode.recordClassIndex(92939);
    }
}
