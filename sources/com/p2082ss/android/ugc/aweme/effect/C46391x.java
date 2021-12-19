package com.p2082ss.android.ugc.aweme.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.effect.x */
public final class C46391x {

    /* renamed from: a */
    public static final boolean f108108a = true;

    /* renamed from: b */
    public static final C46391x f108109b = new C46391x();

    private C46391x() {
    }

    /* renamed from: a */
    public static final boolean m89499a() {
        try {
            return SettingsManager.m29616a().mo25400a("tools_switch_okhttp_to_ttnet", true);
        } catch (Throwable unused) {
            return f108108a;
        }
    }

    static {
        Covode.recordClassIndex(54968);
    }
}
