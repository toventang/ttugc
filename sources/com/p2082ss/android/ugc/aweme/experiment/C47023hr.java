package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.experiment.hr */
public final class C47023hr {

    /* renamed from: a */
    public static final boolean f109550a = false;

    /* renamed from: b */
    public static final C47023hr f109551b = new C47023hr();

    private C47023hr() {
    }

    static {
        Covode.recordClassIndex(55624);
    }

    /* renamed from: a */
    public static boolean m90287a() {
        try {
            return SettingsManager.m29616a().mo25400a("web_image_downloader_switch", false);
        } catch (Throwable unused) {
            return f109550a;
        }
    }
}
