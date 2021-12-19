package com.p2082ss.android.ugc.aweme.p3070im.service.p3252c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.im.service.c.j */
public final class C56215j {

    /* renamed from: a */
    public static final long f128219a = 86400;

    /* renamed from: b */
    public static final C56215j f128220b = new C56215j();

    private C56215j() {
    }

    /* renamed from: a */
    public static final long m102130a() {
        return SettingsManager.m29616a().mo25395a("im_mention_check_valid_duration_for_cold_start", 86400L);
    }

    static {
        Covode.recordClassIndex(66024);
    }
}
