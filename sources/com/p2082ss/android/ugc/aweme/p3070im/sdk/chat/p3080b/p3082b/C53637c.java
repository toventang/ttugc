package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.c */
public final class C53637c {

    /* renamed from: a */
    public static final C53637c f123062a = new C53637c();

    /* renamed from: b */
    private static final C53634a f123063b = new C53634a();

    private C53637c() {
    }

    static {
        Covode.recordClassIndex(63217);
    }

    /* renamed from: a */
    public static C53634a m98894a() {
        try {
            C53634a aVar = (C53634a) SettingsManager.m29616a().mo25396a("im_preload_setting_config", C53634a.class);
            if (aVar == null) {
                return f123063b;
            }
            return aVar;
        } catch (Throwable unused) {
            return f123063b;
        }
    }
}
