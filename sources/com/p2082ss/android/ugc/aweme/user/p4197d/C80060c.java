package com.p2082ss.android.ugc.aweme.user.p4197d;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.user.d.c */
public final class C80060c {

    /* renamed from: a */
    public static final C80060c f179400a = new C80060c();

    private C80060c() {
    }

    static {
        Covode.recordClassIndex(93291);
    }

    /* renamed from: a */
    public static SharedPreferences m138797a() {
        SharedPreferences a = C34822d.m71158a(C31291a.f74991a, "com.ss.spipe_setting", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    private static SharedPreferences m138799b() {
        SharedPreferences a = C34822d.m71158a(C31291a.f74991a, "aweme_user", 0);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static final void m138798a(String str) {
        m138799b().edit().putString("user_info_raw", str).apply();
    }
}
