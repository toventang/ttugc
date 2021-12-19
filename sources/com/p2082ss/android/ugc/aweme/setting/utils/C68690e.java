package com.p2082ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.e */
public final class C68690e {

    /* renamed from: a */
    public static final String f153694a = "https://www.tiktok.com/falcon/forest/nebula/ad_experience_analysis?hide_nav_bar=1";

    /* renamed from: b */
    public static final C68690e f153695b = new C68690e();

    private C68690e() {
    }

    static {
        Covode.recordClassIndex(80951);
    }

    /* renamed from: a */
    public static final String m121123a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.m29616a().mo25398a("low_quality_entry_setting", "https://www.tiktok.com/falcon/forest/nebula/ad_experience_analysis?hide_nav_bar=1");
        } catch (Throwable unused) {
            return f153694a;
        }
    }
}
