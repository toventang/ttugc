package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.c.c */
public final class C33217c {

    /* renamed from: a */
    public static final int f78909a = 300;

    /* renamed from: b */
    public static final C33217c f78910b = new C33217c();

    private C33217c() {
    }

    /* renamed from: a */
    public static final int m68113a() {
        try {
            return SettingsManager.m29616a().mo25394a("interactive_ads_hint_preshow_time_setting", 300);
        } catch (Throwable unused) {
            return f78909a;
        }
    }

    static {
        Covode.recordClassIndex(40041);
    }
}
