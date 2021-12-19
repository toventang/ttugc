package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.d */
public final class C68065d {

    /* renamed from: a */
    public static final C68065d f152457a = new C68065d();

    private C68065d() {
    }

    static {
        Covode.recordClassIndex(80261);
    }

    /* renamed from: a */
    public static final long m120371a() {
        return Math.min(m120372b(), 900000L);
    }

    /* renamed from: b */
    private static long m120372b() {
        return (long) SettingsManager.m29616a().mo25394a("allow_long_video_threshold", 0);
    }
}
