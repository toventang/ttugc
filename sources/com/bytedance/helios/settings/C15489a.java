package com.bytedance.helios.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.bytedance.helios.settings.a */
public final class C15489a {

    /* renamed from: a */
    public static final HeliosSettingsModel f37748a = new HeliosSettingsModel();

    /* renamed from: b */
    public static final C15489a f37749b = new C15489a();

    private C15489a() {
    }

    static {
        Covode.recordClassIndex(17744);
    }

    /* renamed from: a */
    public static final AbstractSettingsModel m28507a() {
        HeliosSettingsModel heliosSettingsModel = (HeliosSettingsModel) SettingsManager.m29616a().mo25397a("helios_settings", HeliosSettingsModel.class, f37748a);
        if (heliosSettingsModel == null) {
            try {
                heliosSettingsModel = (HeliosSettingsModel) SettingsManager.m29616a().mo25396a("helios_settings", HeliosSettingsModel.class);
            } catch (Exception unused) {
            }
            if (heliosSettingsModel == null) {
                return f37748a;
            }
        }
        return heliosSettingsModel;
    }
}
