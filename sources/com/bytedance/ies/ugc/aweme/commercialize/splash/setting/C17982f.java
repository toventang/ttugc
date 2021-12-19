package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.f */
public final class C17982f {

    /* renamed from: a */
    public static final boolean f42825a = true;

    /* renamed from: b */
    public static final C17982f f42826b = new C17982f();

    private C17982f() {
    }

    static {
        Covode.recordClassIndex(20603);
    }

    /* renamed from: a */
    public static final boolean m33501a() {
        try {
            return SettingsManager.m29616a().mo25400a("splash_ad_support_video_engine", true);
        } catch (Throwable unused) {
            return f42825a;
        }
    }
}
