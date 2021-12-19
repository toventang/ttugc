package com.p2082ss.android.ugc.aweme.feed.p2936ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.feed.ab.f */
public final class C48026f {

    /* renamed from: a */
    public static final C48026f f111253a = new C48026f();

    private C48026f() {
    }

    static {
        Covode.recordClassIndex(56753);
    }

    /* renamed from: a */
    public static final boolean m91035a() {
        if (SettingsManager.m29616a().mo25400a("feed_live_no_deduplicate", true)) {
            return true;
        }
        return false;
    }
}
