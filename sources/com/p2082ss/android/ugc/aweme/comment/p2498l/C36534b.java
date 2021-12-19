package com.p2082ss.android.ugc.aweme.comment.p2498l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.comment.l.b */
public final class C36534b {

    /* renamed from: a */
    public static final String f86491a = "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_form%3fhide_nav_bar%3d1%26report_type%3d3";

    /* renamed from: b */
    public static final C36534b f86492b = new C36534b();

    private C36534b() {
    }

    static {
        Covode.recordClassIndex(43837);
    }

    /* renamed from: a */
    public static final String m74349a() {
        try {
            return "aweme://webview/?url=" + SettingsManager.m29616a().mo25398a("report_ads_problem_schema_setting", "https%3a%2f%2fwww.tiktok.com%2ffalcon%2fforest%2fnebula%2fad_feedback_form%3fhide_nav_bar%3d1%26report_type%3d3");
        } catch (Throwable unused) {
            return f86491a;
        }
    }
}
