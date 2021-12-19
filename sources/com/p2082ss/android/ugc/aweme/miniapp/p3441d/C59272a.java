package com.p2082ss.android.ugc.aweme.miniapp.p3441d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.miniapp.d.a */
public final class C59272a {

    /* renamed from: a */
    public static final boolean f135500a = false;

    /* renamed from: b */
    public static final C59272a f135501b = new C59272a();

    private C59272a() {
    }

    static {
        Covode.recordClassIndex(69642);
    }

    /* renamed from: a */
    public static final boolean m108980a() {
        try {
            return SettingsManager.m29616a().mo25400a("miniapp_init_enable", false);
        } catch (Throwable unused) {
            return f135500a;
        }
    }
}
