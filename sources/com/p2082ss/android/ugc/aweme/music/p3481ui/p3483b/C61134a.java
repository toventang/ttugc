package com.p2082ss.android.ugc.aweme.music.p3481ui.p3483b;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;

/* renamed from: com.ss.android.ugc.aweme.music.ui.b.a */
public final class C61134a {
    static {
        Covode.recordClassIndex(71739);
    }

    /* renamed from: a */
    public static boolean m110748a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m110747a(boolean z, String str, String str2, String str3) {
        if (z) {
            C12290b.m22060a("aweme_music_hit_cache_rate", 0, new C33743c().mo59976a("music_id", str).mo59976a("fileUrlList", str2).mo59976a("cache_type", str3).mo59977a());
        } else {
            C12290b.m22060a("aweme_music_hit_cache_rate", 1, new C33743c().mo59976a("music_id", str).mo59976a("fileUrlList", str2).mo59976a("cache_type", str3).mo59977a());
        }
    }
}
