package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.settings.a */
public final class C68722a {

    /* renamed from: a */
    public static final boolean f153736a = true;

    /* renamed from: b */
    public static final C68722a f153737b = new C68722a();

    private C68722a() {
    }

    /* renamed from: a */
    public static final boolean m121157a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_ad_geckox_cache_config", true);
        } catch (Throwable unused) {
            return f153736a;
        }
    }

    static {
        Covode.recordClassIndex(80991);
    }
}
