package com.p2082ss.android.ugc.aweme.p2282ad.feed.sticker;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.b */
public final class C33340b {

    /* renamed from: a */
    public static final int f79210a = 300;

    /* renamed from: b */
    public static final C33340b f79211b = new C33340b();

    private C33340b() {
    }

    /* renamed from: a */
    public static final int m68350a() {
        try {
            return SettingsManager.m29616a().mo25394a("lynx_sticker_delay_setting", 300);
        } catch (Throwable unused) {
            return f79210a;
        }
    }

    static {
        Covode.recordClassIndex(40177);
    }
}
