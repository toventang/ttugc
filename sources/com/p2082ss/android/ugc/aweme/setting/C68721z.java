package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.z */
public final class C68721z {

    /* renamed from: a */
    public static final C68721z f153734a = new C68721z();

    private C68721z() {
    }

    static {
        Covode.recordClassIndex(80988);
    }

    /* renamed from: a */
    public static final C68720y m121156a() {
        try {
            return (C68720y) SettingsManager.m29616a().mo25396a("non_live_gifting_viewer_setting", C68720y.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
