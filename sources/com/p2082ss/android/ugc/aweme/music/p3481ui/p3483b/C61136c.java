package com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.settings.C68758v;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.c */
public final class C61136c {

    /* renamed from: a */
    public static final C61136c f138818a = new C61136c();

    private C61136c() {
    }

    static {
        Covode.recordClassIndex(71741);
    }

    /* renamed from: a */
    public static final void m110753a(long j, String str, String str2, String str3) {
        C12290b.m22060a("aweme_music_play_error_rate", 0, new C33743c().mo59975a("duration", Long.valueOf(j)).mo59976a("fileUri", str2).mo59976a("fileUrlList", str).mo59971a("isUseTTPlayer", Boolean.valueOf(C68758v.m121190a())).mo59976a("trace", str3).mo59977a());
    }

    /* renamed from: a */
    public static final void m110752a(int i, long j, String str, String str2, String str3, String str4) {
        C12290b.m22060a("aweme_music_play_error_rate", i, new C33743c().mo59975a("duration", Long.valueOf(j)).mo59976a("fileUri", str2).mo59976a("fileUrlList", str).mo59976a("errorDesc", str3).mo59971a("isUseTTPlayer", Boolean.valueOf(C68758v.m121190a())).mo59976a("trace", str4).mo59977a());
    }
}
