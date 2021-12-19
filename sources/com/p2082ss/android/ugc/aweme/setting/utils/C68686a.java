package com.p2082ss.android.ugc.aweme.setting.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.setting.utils.a */
public final class C68686a {

    /* renamed from: a */
    public static final String f153688a = "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_list%3fhide_nav_bar%3d1%26report_from%3drate";

    /* renamed from: b */
    public static final C68686a f153689b = new C68686a();

    private C68686a() {
    }

    static {
        Covode.recordClassIndex(80947);
    }

    /* renamed from: a */
    public static final String m121120a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.m29616a().mo25398a("ad_interaction_entry_setting", "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_list%3fhide_nav_bar%3d1%26report_from%3drate");
        } catch (Throwable unused) {
            return f153688a;
        }
    }
}
