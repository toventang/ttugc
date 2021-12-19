package com.p2082ss.android.ugc.aweme.emoji.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.d */
public final class C46642d {

    /* renamed from: c */
    private static C46642d f108761c;

    /* renamed from: d */
    private static volatile long f108762d;

    /* renamed from: a */
    public SharedPreferences f108763a = C34822d.m71158a(C17867d.m33078a(), "aweme_emoji_" + f108762d, 0);

    /* renamed from: b */
    public SharedPreferences f108764b = C34822d.m71158a(C17867d.m33078a(), "aweme_emoji", 0);

    static {
        Covode.recordClassIndex(55234);
    }

    /* renamed from: c */
    public final boolean mo79252c() {
        return this.f108763a.getBoolean("hint_weshine_search", true);
    }

    /* renamed from: d */
    public final String mo79253d() {
        return this.f108764b.getString("key_small_emoji_md5", "");
    }

    /* renamed from: e */
    public final String mo79254e() {
        return this.f108764b.getString("key_im_sys_small_emoji_md5", "");
    }

    /* renamed from: f */
    public final int mo79255f() {
        return this.f108764b.getInt("key_im_sys_small_emoji_version", 0);
    }

    /* renamed from: h */
    public final String mo79257h() {
        return this.f108764b.getString("last_login_user_id", "");
    }

    /* renamed from: b */
    public final void mo79251b() {
        this.f108763a.edit().putBoolean("hint_weshine_search", false).commit();
    }

    /* renamed from: g */
    public final void mo79256g() {
        this.f108764b.edit().putString("last_login_user_id", C46639a.m90021b().toString()).commit();
    }

    private C46642d() {
        f108762d = C46639a.m90022c();
    }

    /* renamed from: a */
    public static synchronized C46642d m90028a() {
        C46642d dVar;
        synchronized (C46642d.class) {
            MethodCollector.m26663i(12112);
            long c = C46639a.m90022c();
            if (f108761c == null || c != f108762d) {
                synchronized (C46642d.class) {
                    try {
                        if (f108761c == null || c != f108762d) {
                            f108761c = new C46642d();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(12112);
                        throw th;
                    }
                }
            }
            dVar = f108761c;
            MethodCollector.m26664o(12112);
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo79250a(String str) {
        this.f108764b.edit().putString("key_small_emoji_md5", str).commit();
    }
}
