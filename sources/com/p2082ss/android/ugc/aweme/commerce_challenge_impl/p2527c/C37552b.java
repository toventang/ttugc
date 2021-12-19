package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.c.b */
public final class C37552b {

    /* renamed from: a */
    public static final boolean f88749a = false;

    /* renamed from: b */
    public static final C37552b f88750b = new C37552b();

    private C37552b() {
    }

    static {
        Covode.recordClassIndex(44949);
    }

    /* renamed from: a */
    public static final boolean m75719a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_emoji_of_non_commerce_hashtag", false);
        } catch (Throwable unused) {
            return f88749a;
        }
    }
}
