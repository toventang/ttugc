package com.p2082ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.feed.s */
public final class C49907s {

    /* renamed from: a */
    public static boolean f115049a;

    /* renamed from: b */
    public static EnumC48310af f115050b = EnumC48310af.FEED;

    /* renamed from: c */
    public static long f115051c = -1;

    /* renamed from: d */
    public static long f115052d = -1;

    /* renamed from: e */
    private static volatile Boolean f115053e;

    /* renamed from: f */
    private static AbstractC49908a f115054f;

    /* renamed from: com.ss.android.ugc.aweme.feed.s$a */
    public interface AbstractC49908a {
        static {
            Covode.recordClassIndex(59015);
        }

        /* renamed from: a */
        void mo80413a(EnumC48310af afVar);
    }

    /* renamed from: c */
    public static long m93689c() {
        long j = f115052d;
        f115052d = 0;
        return j;
    }

    /* renamed from: a */
    public static Boolean m93685a() {
        if (f115053e == null) {
            m93690d();
        }
        return f115053e;
    }

    static {
        Covode.recordClassIndex(59014);
    }

    /* renamed from: b */
    public static String m93688b() {
        Activity j = C17873f.m33102j();
        if (j != null) {
            return j.getClass().getSimpleName();
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m93690d() {
        if (C17867d.m33078a() == null) {
            return false;
        }
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "prefs_feed_check", 0);
        boolean z = a.getBoolean("key_first_launch", true);
        if (f115053e == null) {
            f115053e = Boolean.valueOf(z);
        }
        if (f115053e.booleanValue()) {
            Keva.getRepo("repo_story_cold_start").storeBoolean("key_new_user", true);
        }
        a.edit().putBoolean("key_first_launch", false).apply();
        Keva repo = Keva.getRepo("repo_new_version_journey");
        if (repo.getLong("key_first_launch_time", 0) == 0) {
            repo.storeLong("key_first_launch_time", System.currentTimeMillis());
        }
        return f115053e.booleanValue();
    }

    /* renamed from: a */
    public static void m93687a(AbstractC49908a aVar) {
        if (aVar != null) {
            f115054f = aVar;
        }
    }

    /* renamed from: a */
    public static void m93686a(EnumC48310af afVar) {
        f115050b = afVar;
        AbstractC49908a aVar = f115054f;
        if (aVar != null) {
            aVar.mo80413a(afVar);
        }
    }
}
