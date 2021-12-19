package com.p2082ss.android.ugc.aweme.search.p3687e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.search.e.e */
public final class C67382e {

    /* renamed from: a */
    public static final C67385h f150956a = new C67385h((byte) 0);

    /* renamed from: b */
    public static final C67382e f150957b = new C67382e();

    /* renamed from: c */
    private static final long f150958c = TimeUnit.HOURS.toMillis(12);

    private C67382e() {
    }

    /* renamed from: c */
    public static String m119427c() {
        String str;
        C67385h e = m119429e();
        if (e == null || (str = e.f150961c) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    public static String m119428d() {
        String str;
        C67385h e = m119429e();
        if (e == null || (str = e.f150962d) == null) {
            return "";
        }
        return str;
    }

    static {
        Covode.recordClassIndex(79012);
    }

    /* renamed from: a */
    public static boolean m119425a() {
        Integer num;
        C67385h e = m119429e();
        if (e == null || (num = e.f150959a) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static long m119426b() {
        Long l;
        C67385h e = m119429e();
        if (e == null || (l = e.f150960b) == null) {
            return f150958c;
        }
        return l.longValue();
    }

    /* renamed from: e */
    private static C67385h m119429e() {
        return (C67385h) SettingsManager.m29616a().mo25397a("search_easter_egg", C67385h.class, f150956a);
    }
}
