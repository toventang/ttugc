package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.property.bn */
public final class C65374bn {

    /* renamed from: a */
    public static final C65374bn f147512a = new C65374bn();

    private C65374bn() {
    }

    static {
        Covode.recordClassIndex(76861);
    }

    /* renamed from: a */
    public static final boolean m117070a() {
        if (SettingsManager.m29616a().mo25394a("enable_cover_effect", 0) == 1) {
            return true;
        }
        return false;
    }
}
