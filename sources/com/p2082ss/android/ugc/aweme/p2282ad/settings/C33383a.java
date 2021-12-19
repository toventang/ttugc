package com.p2082ss.android.ugc.aweme.p2282ad.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.settings.a */
public final class C33383a {

    /* renamed from: a */
    public static final boolean f79328a = true;

    /* renamed from: b */
    public static final C33383a f79329b = new C33383a();

    private C33383a() {
    }

    /* renamed from: a */
    public static boolean m68467a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_google_ua", true);
        } catch (Throwable unused) {
            return f79328a;
        }
    }

    static {
        Covode.recordClassIndex(40231);
    }
}
