package com.p2082ss.android.ugc.aweme.feed.p2970ui.instagram;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.instagram.f */
public final class C50317f {

    /* renamed from: a */
    public static final C50317f f116190a = new C50317f();

    private C50317f() {
    }

    static {
        Covode.recordClassIndex(59445);
    }

    /* renamed from: a */
    public static C50316e m94416a() {
        try {
            C50316e eVar = (C50316e) SettingsManager.m29616a().mo25396a("third_party_dialog_settings", C50316e.class);
            if (eVar == null) {
                return new C50316e();
            }
            return eVar;
        } catch (Throwable unused) {
            return new C50316e();
        }
    }
}
