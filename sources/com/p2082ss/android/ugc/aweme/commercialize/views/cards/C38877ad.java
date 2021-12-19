package com.p2082ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ad */
public final class C38877ad {

    /* renamed from: a */
    public static final boolean f91821a = true;

    /* renamed from: b */
    public static final C38877ad f91822b = new C38877ad();

    private C38877ad() {
    }

    /* renamed from: a */
    public static final boolean m78921a() {
        try {
            return SettingsManager.m29616a().mo25400a("enable_ad_half_web_page_log", true);
        } catch (Throwable unused) {
            return f91821a;
        }
    }

    static {
        Covode.recordClassIndex(46464);
    }
}
