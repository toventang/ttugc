package com.p2082ss.android.ugc.aweme.p2282ad.dynamic;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.dynamic.d */
public final class C33187d {

    /* renamed from: a */
    public static final C33187d f78859a = new C33187d();

    private C33187d() {
    }

    static {
        Covode.recordClassIndex(40007);
    }

    /* renamed from: a */
    public static DynamicAdConfig m68023a() {
        try {
            return (DynamicAdConfig) SettingsManager.m29616a().mo25396a("dynamic_ad_config", DynamicAdConfig.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
