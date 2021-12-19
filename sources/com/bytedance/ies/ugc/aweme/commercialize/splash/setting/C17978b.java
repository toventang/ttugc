package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.b */
public final class C17978b {

    /* renamed from: a */
    public static final boolean f42818a = false;

    /* renamed from: b */
    public static final C17978b f42819b = new C17978b();

    private C17978b() {
    }

    static {
        Covode.recordClassIndex(20599);
    }

    /* renamed from: a */
    public static boolean m33498a() {
        try {
            return SettingsManager.m29616a().mo25400a("pre_topview_video", false);
        } catch (Throwable unused) {
            return f42818a;
        }
    }
}
