package com.bytedance.geckox.settings;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1016d.C14904b;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.utils.C15067n;
import com.google.gson.C28027t;

/* renamed from: com.bytedance.geckox.settings.c */
public final class C15016c {
    static {
        Covode.recordClassIndex(17161);
    }

    /* renamed from: a */
    public static GlobalConfigSettings m27632a(Context context) {
        String b = C15067n.m27740a().mo24342b(context, "gecko_settings", null);
        if (b == null) {
            return null;
        }
        try {
            return (GlobalConfigSettings) C14904b.f36400a.f36401b.mo46670a(b, GlobalConfigSettings.class);
        } catch (C28027t unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static SettingsLocal m27633b(Context context) {
        String b = C15067n.m27740a().mo24342b(context, "gecko_settings_local", null);
        if (b == null) {
            return null;
        }
        try {
            return (SettingsLocal) C14904b.f36400a.f36401b.mo46670a(b, SettingsLocal.class);
        } catch (C28027t unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m27634c(Context context) {
        C14957a.m27543a("settings cache deleted");
        C15067n.m27740a().mo24340a(context, "gecko_settings");
    }
}
