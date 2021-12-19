package com.p2082ss.android.ugc.aweme.sharer.ext.p3780a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.sharer.ext.a.a */
public final class C69588a {

    /* renamed from: a */
    public static final boolean f155426a = true;

    /* renamed from: b */
    public static final C69588a f155427b = new C69588a();

    private C69588a() {
    }

    /* renamed from: a */
    public static boolean m122881a() {
        try {
            return SettingsManager.m29616a().mo25400a("delay_initialize_share_SDK", true);
        } catch (Throwable unused) {
            return f155426a;
        }
    }

    static {
        Covode.recordClassIndex(81960);
    }
}
