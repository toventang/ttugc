package com.p2082ss.android.ugc.tiktok.security.p4335c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.tiktok.security.c.b */
public final class C84367b {

    /* renamed from: a */
    public static final boolean f188618a = false;

    /* renamed from: b */
    public static final C84367b f188619b = new C84367b();

    private C84367b() {
    }

    static {
        Covode.recordClassIndex(98319);
    }

    /* renamed from: a */
    public static boolean m145126a() {
        try {
            return SettingsManager.m29616a().mo25400a("webview_csrf_switch", false);
        } catch (Throwable unused) {
            return f188618a;
        }
    }
}
