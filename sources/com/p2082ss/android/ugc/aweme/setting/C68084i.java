package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.i */
public final class C68084i {

    /* renamed from: a */
    public static final C68084i f152480a = new C68084i();

    private C68084i() {
    }

    static {
        Covode.recordClassIndex(80280);
    }

    /* renamed from: a */
    public static final C68082h m120386a() {
        try {
            return (C68082h) SettingsManager.m29616a().mo25396a("creator_portal_locale", C68082h.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
