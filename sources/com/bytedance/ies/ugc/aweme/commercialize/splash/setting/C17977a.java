package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.a */
public final class C17977a {

    /* renamed from: a */
    public static final boolean f42816a = true;

    /* renamed from: b */
    public static final C17977a f42817b = new C17977a();

    private C17977a() {
    }

    static {
        Covode.recordClassIndex(20598);
    }

    /* renamed from: a */
    public static boolean m33497a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_force_skip_topview", true);
        } catch (Throwable unused) {
            return f42816a;
        }
    }
}
