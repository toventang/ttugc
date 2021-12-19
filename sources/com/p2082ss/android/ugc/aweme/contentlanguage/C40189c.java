package com.p2082ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.c */
public final class C40189c {

    /* renamed from: a */
    public static final int f94362a = 5;

    /* renamed from: b */
    public static final C40189c f94363b = new C40189c();

    private C40189c() {
    }

    /* renamed from: a */
    public static final int m81301a() {
        try {
            return SettingsManager.m29616a().mo25394a("content_lang_limit", 5);
        } catch (Throwable unused) {
            return 5;
        }
    }

    static {
        Covode.recordClassIndex(47984);
    }
}
