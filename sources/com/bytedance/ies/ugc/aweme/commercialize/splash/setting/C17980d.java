package com.bytedance.ies.ugc.aweme.commercialize.splash.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.setting.d */
public final class C17980d {

    /* renamed from: a */
    public static final C17979c f42821a = null;

    /* renamed from: b */
    public static final C17980d f42822b = new C17980d();

    private C17980d() {
    }

    static {
        Covode.recordClassIndex(20601);
    }

    /* renamed from: a */
    public static final C17979c m33499a() {
        try {
            return (C17979c) SettingsManager.m29616a().mo25396a("ad_splash_config", C17979c.class);
        } catch (Exception unused) {
            return f42821a;
        }
    }
}
