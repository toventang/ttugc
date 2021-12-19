package com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.settings.C68758v;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.b */
public final class C61135b {

    /* renamed from: a */
    public static final C61135b f138817a = new C61135b();

    private C61135b() {
    }

    static {
        Covode.recordClassIndex(71740);
    }

    /* renamed from: a */
    public static boolean m110751a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m110749a(String str, String str2, String str3, Long l) {
        C39162r.m79460a("download_play_succeed", new C33744d().mo59983a("music_id", str).mo59983a("url", str3).mo59982a("time", l).mo59983a("url_list", str2).mo59982a("is_use_tt_player", Boolean.valueOf(C68758v.m121190a())).f79943a);
    }

    /* renamed from: a */
    public static void m110750a(String str, String str2, String str3, String str4) {
        C39162r.m79460a("download_play_failed", new C33744d().mo59983a("music_id", str).mo59983a("url", str3).mo59983a("fail_reason", str4).mo59983a("url_list", str2).mo59982a("is_use_tt_player", Boolean.valueOf(C68758v.m121190a())).f79943a);
    }
}
