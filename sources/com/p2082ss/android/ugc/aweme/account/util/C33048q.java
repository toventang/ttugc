package com.p2082ss.android.ugc.aweme.account.util;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.account.util.q */
public final class C33048q {

    /* renamed from: a */
    public static int f78600a = -1;

    static {
        Covode.recordClassIndex(39855);
    }

    /* renamed from: a */
    public static int m67685a() {
        return m67692c().getInt("ftc_age_gate_response_mode", 0);
    }

    /* renamed from: b */
    public static String m67689b() {
        return m67692c().getString("after_login_birthday", "");
    }

    /* renamed from: c */
    public static SharedPreferences m67692c() {
        return C34822d.m71158a(C31291a.f74991a, "aweme-app", 0);
    }

    /* renamed from: d */
    public static SharedPreferences m67694d() {
        return C34822d.m71158a(C31291a.f74991a, "aweme_account_terminal_relative_sp", 0);
    }

    /* renamed from: a */
    public static int m67686a(String str) {
        return m67692c().getInt("ftc_age_gate_response_mode".concat(String.valueOf(str)), -1);
    }

    /* renamed from: b */
    public static void m67690b(String str) {
        m67692c().edit().putString("after_login_birthday", str).apply();
    }

    /* renamed from: c */
    public static void m67693c(boolean z) {
        m67692c().edit().putBoolean("ftc_create_password_showing", z).apply();
    }

    /* renamed from: d */
    public static void m67695d(boolean z) {
        m67694d().edit().putBoolean("account_terminal_app_has_logged_out", z).apply();
    }

    /* renamed from: b */
    public static void m67691b(boolean z) {
        m67692c().edit().putBoolean("ftc_create_account_showing", z).apply();
    }

    /* renamed from: a */
    public static void m67688a(boolean z) {
        m67692c().edit().putBoolean("ftc_delete_video_alert_showing", z).apply();
    }

    /* renamed from: a */
    public static void m67687a(String str, int i) {
        m67692c().edit().putInt("ftc_age_gate_response_mode".concat(String.valueOf(str)), i).apply();
    }
}
