package com.p2082ss.android.ugc.aweme.share.p3752h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.share.h.c */
public final class C68958c {

    /* renamed from: a */
    public static final boolean f154269a = true;

    /* renamed from: b */
    public static final C68958c f154270b = new C68958c();

    private C68958c() {
    }

    /* renamed from: a */
    public static boolean m121642a() {
        try {
            return SettingsManager.m29616a().mo25400a("pk_allow_client_watermark", true);
        } catch (Throwable unused) {
            return f154269a;
        }
    }

    static {
        Covode.recordClassIndex(81270);
    }
}
