package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.a */
public final class C55061a {

    /* renamed from: a */
    public static final long f126012a = 300000;

    /* renamed from: b */
    public static final C55061a f126013b = new C55061a();

    private C55061a() {
    }

    static {
        Covode.recordClassIndex(64789);
    }

    /* renamed from: a */
    public static long m100701a() {
        try {
            return SettingsManager.m29616a().mo25395a("im_feed_video_status_valid_duration", 300000L);
        } catch (Exception unused) {
            return f126012a;
        }
    }
}
