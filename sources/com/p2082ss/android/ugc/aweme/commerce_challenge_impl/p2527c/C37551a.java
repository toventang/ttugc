package com.p2082ss.android.ugc.aweme.commerce_challenge_impl.p2527c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.c.a */
public final class C37551a {

    /* renamed from: a */
    public static final boolean f88747a = true;

    /* renamed from: b */
    public static final C37551a f88748b = new C37551a();

    private C37551a() {
    }

    /* renamed from: a */
    public static final boolean m75718a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_edit_hashtag_with_emoji", true);
        } catch (Throwable unused) {
            return f88747a;
        }
    }

    static {
        Covode.recordClassIndex(44948);
    }
}
