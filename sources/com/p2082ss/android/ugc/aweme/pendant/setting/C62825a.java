package com.p2082ss.android.ugc.aweme.pendant.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.pendant.setting.a */
public final class C62825a {

    /* renamed from: a */
    public static final C62825a f142463a = new C62825a();

    private C62825a() {
    }

    static {
        Covode.recordClassIndex(73649);
    }

    /* renamed from: a */
    public static final ShredConfigurationData m113221a() {
        try {
            ShredConfigurationData shredConfigurationData = (ShredConfigurationData) SettingsManager.m29616a().mo25396a("fragments_configuration", ShredConfigurationData.class);
            if (shredConfigurationData == null) {
                return new ShredConfigurationData(false, new int[0]);
            }
            return shredConfigurationData;
        } catch (Throwable unused) {
        }
    }
}
