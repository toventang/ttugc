package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.b */
public final class C33384b {

    /* renamed from: a */
    public static final boolean f79330a = true;

    /* renamed from: b */
    public static final C33384b f79331b = new C33384b();

    private C33384b() {
    }

    /* renamed from: a */
    public static boolean m68468a() {
        try {
            return SettingsManager.m29616a().mo25400a("upload_ad_web_preload_info", true);
        } catch (Throwable unused) {
            return f79330a;
        }
    }

    static {
        Covode.recordClassIndex(40232);
    }
}
