package com.p2082ss.android.ugc.aweme.download.component_api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.download.component_api.b */
public final class C43172b {

    /* renamed from: a */
    public static final boolean f100656a = false;

    /* renamed from: b */
    public static final C43172b f100657b = new C43172b();

    private C43172b() {
    }

    static {
        Covode.recordClassIndex(51352);
    }

    /* renamed from: a */
    public static final boolean m86104a() {
        try {
            return SettingsManager.m29616a().mo25400a("download_component_exp_switch", false);
        } catch (Throwable unused) {
            return f100656a;
        }
    }
}
