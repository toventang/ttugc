package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.i */
public final class C17992i {

    /* renamed from: a */
    public static final boolean f42843a = true;

    /* renamed from: b */
    public static final C17992i f42844b = new C17992i();

    private C17992i() {
    }

    static {
        Covode.recordClassIndex(20613);
    }

    /* renamed from: a */
    public static boolean m33506a() {
        try {
            return SettingsManager.m29616a().mo25400a("splash_one_cold_start", true);
        } catch (Throwable unused) {
            return f42843a;
        }
    }
}
