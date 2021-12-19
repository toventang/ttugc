package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.ae */
public final class C68730ae {

    /* renamed from: a */
    public static final C68729ad f153750a = null;

    /* renamed from: b */
    public static final C68730ae f153751b = new C68730ae();

    private C68730ae() {
    }

    static {
        Covode.recordClassIndex(80999);
    }

    /* renamed from: a */
    public static final C68729ad m121164a() {
        try {
            return (C68729ad) SettingsManager.m29616a().mo25397a("send_analytics_event_data", C68729ad.class, f153750a);
        } catch (Throwable unused) {
            return f153750a;
        }
    }
}
