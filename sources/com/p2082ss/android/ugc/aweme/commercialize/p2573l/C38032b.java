package com.p2082ss.android.ugc.aweme.commercialize.p2573l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.l.b */
public final class C38032b {

    /* renamed from: a */
    public static final boolean f89865a = true;

    /* renamed from: b */
    public static final C38032b f89866b = new C38032b();

    private C38032b() {
    }

    /* renamed from: a */
    public static final boolean m77102a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_preload_component", true);
        } catch (Throwable unused) {
            return f89865a;
        }
    }

    static {
        Covode.recordClassIndex(45494);
    }
}
