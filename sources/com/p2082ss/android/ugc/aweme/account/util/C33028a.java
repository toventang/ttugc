package com.p2082ss.android.ugc.aweme.account.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.account.util.a */
public final class C33028a {

    /* renamed from: a */
    public static final boolean f78573a = true;

    /* renamed from: b */
    public static final C33028a f78574b = new C33028a();

    private C33028a() {
    }

    /* renamed from: a */
    public static final boolean m67665a() {
        try {
            return SettingsManager.m29616a().mo25400a("http_cookie_error", true);
        } catch (Exception unused) {
            return f78573a;
        }
    }

    static {
        Covode.recordClassIndex(39835);
    }
}
